package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.harunbekcan.cleanarchitecturecomposeproject.domain.uimodel.UserUiModel
import com.harunbekcan.cleanarchitecturecomposeproject.ui.theme.LightYellow
import com.harunbekcan.cleanarchitecturecomposeproject.R


@Composable
fun UserItem(userUiModel: UserUiModel) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = LightYellow,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Column {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(R.string.name),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 16.dp
                        )
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = userUiModel.name,
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 16.dp,
                            end = 8.dp
                        )

                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(R.string.user_name),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(
                            top = 16.dp,
                            start = 8.dp
                        )
                )
                Text(
                    text = userUiModel.username,
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 16.dp,
                            end = 8.dp
                        )
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(R.string.website),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(
                            top = 16.dp,
                            start = 8.dp,
                            bottom = 8.dp
                        )
                )
                Text(
                    text = userUiModel.website,
                    modifier = Modifier
                        .padding(
                            start = 8.dp,
                            top = 16.dp,
                            end = 8.dp
                        )
                )
            }
        }
    }

}