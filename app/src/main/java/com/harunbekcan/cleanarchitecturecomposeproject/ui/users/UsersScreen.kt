package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import androidx.compose.runtime.Composable
import com.harunbekcan.cleanarchitecturecomposeproject.domain.uimodel.UserUiModel


@Composable
fun UsersScreen(userUiModel: UserUiModel) {
    UserItem(userUiModel)
}