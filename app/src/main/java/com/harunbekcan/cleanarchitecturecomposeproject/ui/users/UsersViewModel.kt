package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.harunbekcan.cleanarchitecturecomposeproject.domain.uimodel.UserUiModel
import com.harunbekcan.cleanarchitecturecomposeproject.domain.usecase.GetUsersUseCase
import com.harunbekcan.cleanarchitecturecomposeproject.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(private val getUsersUseCase: GetUsersUseCase): ViewModel() {

    private var allUsers = listOf<UserUiModel>()
    private val _state = mutableStateOf(UsersState())
    val state: State<UsersState> = _state

    init {
        getUsers()
    }

    private fun getUsers() {
        getUsersUseCase.users.onEach { result ->
            when (result) {
                Resource.Loading -> _state.value = UsersState(isLoading = true)
                is Resource.Success -> {
                    result.data.let {
                        _state.value = UsersState(users = it)
                        allUsers = it
                    }
                }
                is Resource.Error -> _state.value = UsersState(error = result.errorMessage)
            }
        }.launchIn(viewModelScope)
    }
}