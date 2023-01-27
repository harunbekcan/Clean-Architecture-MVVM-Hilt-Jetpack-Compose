package com.harunbekcan.cleanarchitecturecomposeproject.data.mapper

import com.harunbekcan.cleanarchitecturecomposeproject.data.response.UserResponseItem
import com.harunbekcan.cleanarchitecturecomposeproject.domain.uimodel.UserUiModel


fun UserResponseItem.toUserUiModel() = UserUiModel(
    address = address,
    company = company,
    email = email.orEmpty(),
    id = id ?: -1,
    name = name.orEmpty(),
    phone = phone.orEmpty(),
    username = username.orEmpty(),
    website = website.orEmpty()
)
