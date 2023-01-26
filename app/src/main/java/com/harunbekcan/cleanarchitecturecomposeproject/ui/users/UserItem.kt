package com.harunbekcan.cleanarchitecturecomposeproject.ui.users

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.harunbekcan.cleanarchitecturecomposeproject.domain.uimodel.UserUiModel
import com.harunbekcan.cleanarchitecturecomposeproject.ui.theme.LightGray

@Composable
fun UserItem(userUiModel: UserUiModel) {
    Card(
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.5.dp, LightGray),
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier
            .width(200.dp)
            .wrapContentHeight()
    ) {
        Column {
            Row(modifier = Modifier.width(200.dp)) {
                Text(
                    text = "Name:",
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
            Row(modifier = Modifier.width(200.dp)) {
                Text(
                    text = "User Name:",
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

            Row(modifier = Modifier.width(200.dp)) {
                Text(
                    text = "WebSite:",
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