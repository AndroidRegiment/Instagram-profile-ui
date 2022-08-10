package com.xtremedevx.insta.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.xtremedevx.insta.data.relatedProfile.listOfRelatedProfile
import com.xtremedevx.insta.ui.theme.LightBlue

@Preview(showBackground = true)
@Composable
fun TopNavBar(
    modifier: Modifier = Modifier,
    fullName: String = "Android",
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.ChevronLeft, contentDescription = null)
        }
        Text(
            text = fullName,
            modifier = modifier.weight(1F),
            textAlign = TextAlign.Center

        )
        IconButton(onClick = { }) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TopNavBar()
        ShowUserPost(content = { UserBio() })
    }
}


@Preview(showBackground = true)
@Composable
fun UserBio() {
    Column(modifier = Modifier.padding(8.dp)) {
        UserProfileHeader()
        FollowButton()
        RelatedProfilesList(list = listOfRelatedProfile)
        Spacer(modifier = Modifier.height(10.dp))
        Icon(
            imageVector = Icons.Filled.GridOn,
            contentDescription = null,
            modifier = Modifier.align(CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(2.dp))
        Divider(thickness = 1.dp, color = Color.LightGray)
        Spacer(modifier = Modifier.height(2.dp))
    }
}


@Composable
fun UserProfileHeader() {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = "https://instagram.fdel7-1.fna.fbcdn.net/v/t51.2885-19/67402848_2143993462371952_6370236252943286272_n.jpg?stp=dst-jpg_s150x150&_nc_ht=instagram.fdel7-1.fna.fbcdn.net&_nc_cat=104&_nc_ohc=8smFb2V3f3cAX8IDNrB&edm=AAuNW_gBAAAA&ccb=7-5&oh=00_AT-QPFBLpOkQH1LX6Qc5_ed5wvKX1UD5ZGgNS7j2SbgCWA&oe=62F5E667&_nc_sid=498da5",
                contentDescription = null,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
            ShowUserStats()

        }
        ShowUserBio()

    }
}


@Preview(showBackground = true)
@Composable
fun ShowUserStats() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        UserStats(name = "Posts", data = "1.5k")
        UserStats(name = "Follower", data = "1M")
        UserStats(name = "Following", data = "43")
    }
}

@Composable
fun UserStats(name: String, data: String) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = data, textAlign = TextAlign.Center, fontSize = 18.sp)
        Text(text = name, textAlign = TextAlign.Center, fontSize = 18.sp)
    }
}

@Composable
fun ShowUserBio() {
    Column(modifier = Modifier.fillMaxWidth()) {
        ShowUserNameWithVerified(userName = "android", isVerified = true)

        Text(
            text = "\ud83d\udc4b Stay and scroll awhile. Find the latest news, tips, and tricks direct from the #Android team. \ud83d\udccd Mountain View, CA.",

            )
        Text(text = "https://linkin.bio/android", color = LightBlue)
    }
}


















