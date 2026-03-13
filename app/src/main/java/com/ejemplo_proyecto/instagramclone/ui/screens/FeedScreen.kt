package com.ejemplo_proyecto.instagramclone.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ejemplo_proyecto.instagramclone.data.DataSource
import com.ejemplo_proyecto.instagramclone.model.Post
import com.ejemplo_proyecto.instagramclone.ui.components.PostCard
import com.ejemplo_proyecto.instagramclone.ui.components.StoriesRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedScreen() {
    val posts = remember { DataSource.getPosts() }
    val stories = remember { DataSource.getStories() }

    Scaffold(
        topBar = { FeedTopBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            item(key = "stories") {
                StoriesRow(stories = stories)
                Divider()
            }

            items(posts, key = { it.id }) { post ->
                PostCard(
                    post = post,
                    onLikeClick = { _: Post -> }
                )
                Divider()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FeedTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Instagram",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "Notificaciones"
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Send,
                    contentDescription = "Mensajes"
                )
            }
        },
        scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    )
}
