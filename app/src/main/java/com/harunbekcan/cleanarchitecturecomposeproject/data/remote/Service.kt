package com.harunbekcan.cleanarchitecturecomposeproject.data.remote

import com.harunbekcan.cleanarchitecturecomposeproject.data.response.UserResponse
import com.harunbekcan.cleanarchitecturecomposeproject.utils.Constants.USERS
import retrofit2.http.GET

interface Service {

    @GET(USERS)
    suspend fun getUsers(): UserResponse
}