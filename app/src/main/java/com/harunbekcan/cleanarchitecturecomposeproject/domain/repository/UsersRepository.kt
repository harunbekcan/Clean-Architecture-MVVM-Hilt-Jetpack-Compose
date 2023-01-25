package com.harunbekcan.cleanarchitecturecomposeproject.domain.repository

import com.harunbekcan.cleanarchitecturecomposeproject.data.response.UserResponse

interface UsersRepository {

    suspend fun getUsers(): UserResponse
}