package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import com.harunbekcan.cleanarchitecturecomposeproject.domain.uimodel.UserUiModel

data class UsersState(
    val isLoading: Boolean = false,
    val users: List<UserUiModel> = emptyList(),
    val error: String = ""
)