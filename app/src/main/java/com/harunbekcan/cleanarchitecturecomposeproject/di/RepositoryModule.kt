package com.harunbekcan.cleanarchitecturecomposeproject.di

import com.harunbekcan.cleanarchitecturecomposeproject.data.remote.Service
import com.harunbekcan.cleanarchitecturecomposeproject.data.repository.UsersRepositoryImpl
import com.harunbekcan.cleanarchitecturecomposeproject.domain.repository.UsersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideUsersRepository(service: Service) : UsersRepository = UsersRepositoryImpl(service)
}