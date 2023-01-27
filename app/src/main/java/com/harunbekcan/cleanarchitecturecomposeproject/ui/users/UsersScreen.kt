package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun UsersScreen(viewModel: UsersViewModel = hiltViewModel()) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        UserList(viewModel)
    }
}

@Composable
fun UserList(
    viewModel: UsersViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    LazyColumn(
        contentPadding = PaddingValues(12.dp)
    ) {
        items(state.users) { userItem ->
            UserItem(
                userUiModel = userItem
            )
        }
    }

}