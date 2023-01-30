package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.harunbekcan.cleanarchitecturecomposeproject.ui.theme.Teal200


@Composable
fun UsersScreen(viewModel: UsersViewModel = hiltViewModel()) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        UserList(viewModel)
        CircularProgressDialog(viewModel)
    }
}

@Composable
fun UserList(viewModel: UsersViewModel = hiltViewModel()) {
    LazyColumn(contentPadding = PaddingValues(12.dp)) {
        items(viewModel.state.value.users) { userItem ->
            UserItem(userUiModel = userItem)
        }
    }
}

@Composable
fun CircularProgressDialog(viewModel: UsersViewModel = hiltViewModel()){
    if (viewModel.state.value.isLoading) {
        Box {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center),
                color = Teal200
            )
        }
    }
}