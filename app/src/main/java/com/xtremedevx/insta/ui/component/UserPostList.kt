package com.xtremedevx.insta.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GridOn
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.xtremedevx.insta.data.relatedProfile.RelatedProfileData
import com.xtremedevx.insta.ui.theme.LightBlue
import com.xtremedevx.insta.ui.theme.OffWhite


@Composable
fun RelatedProfilesList(
    modifier: Modifier = Modifier,
    list: List<RelatedProfileData>
) {
    var showRelatedProfiles by remember {
        mutableStateOf(true)
    }
    Surface(
        modifier = modifier
            .padding(5.dp)
            .fillMaxWidth(),
        color = OffWhite,
    ) {

        Column(
            modifier = modifier,
        ) {

            Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Related Profile", Modifier.weight(1f))
                IconButton(onClick = { showRelatedProfiles = !showRelatedProfiles }) {
                    Icon(
                        imageVector = if (showRelatedProfiles)
                            Icons.Outlined.ArrowDropUp
                        else
                            Icons.Outlined.ArrowDropDown,
                        contentDescription = null
                    )
                }
            }
            if (showRelatedProfiles) {
                LazyRow() {
                    items(list) { item ->
                        RelatedProfileCard(data = item)

                    }
                }
            }
        }
    }
}

@Composable
fun RelatedProfileCard(data: RelatedProfileData) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(vertical = 2.dp),

        ) {
        Card(
            modifier = Modifier
                .wrapContentWidth()
                .padding(8.dp)

        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                AsyncImage(
                    model = data.image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape),

                    contentScale = ContentScale.Crop,

                    )
                ShowUserNameWithVerified(userName = data.userName, isVerified = data.isVerified)
                FollowButton()
            }
        }
    }
}


@Composable
fun ShowUserPost(content: @Composable () -> Unit) {
    val listOfImage =
        List(15) {
            "https://media.cgtrader.com/variants/sMENAMeHnsnQUKYUbfRQVfmC/e44aa6a6359827c9089792cde0c079681b83d3b5c3037cc0525c25607e54355b/1.jpg"
        }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
    ) {
        item(span = {
            GridItemSpan(maxLineSpan)
        }) {
            content()
        }

        items(listOfImage) { image ->
            AsyncImage(
                model = image, contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)
                    .aspectRatio(1f, true),
                contentScale = ContentScale.Crop,
            )
        }

    }
}


























