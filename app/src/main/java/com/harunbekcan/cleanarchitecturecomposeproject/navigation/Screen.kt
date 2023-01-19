package com.harunbekcan.cleanarchitecturecomposeproject.navigation

sealed class Screen(val route: String){
    object Users : Screen("users_screen")
}
