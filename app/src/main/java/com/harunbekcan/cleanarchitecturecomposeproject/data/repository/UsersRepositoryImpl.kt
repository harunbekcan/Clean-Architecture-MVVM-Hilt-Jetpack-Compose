package com.harunbekcan.cleanarchitecturecomposeproject.data.repository

import com.harunbekcan.cleanarchitecturecomposeproject.data.remote.Service
import com.harunbekcan.cleanarchitecturecomposeproject.data.response.UserResponse
import com.harunbekcan.cleanarchitecturecomposeproject.domain.repository.UsersRepository
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(private val service: Service): UsersRepository {

    override suspend fun getUsers(): UserResponse = service.getUsers()
}