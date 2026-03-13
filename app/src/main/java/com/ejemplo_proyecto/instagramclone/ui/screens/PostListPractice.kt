package com.ejemplo_proyecto.instagramclone.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ejemplo_proyecto.instagramclone.data.DataSource
import com.ejemplo_proyecto.instagramclone.model.Post

// Pantalla de práctica: LazyColumn con lista vertical de posts
@Composable
fun PostListPractice() {
    val posts = remember { DataSource.getPosts() }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(
            items = posts,
            key = { it.id }
        ) { post ->
            PostItemSimple(post = post)
        }
    }
}

@Composable
private fun PostItemSimple(post: Post) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = post.username,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = post.caption,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "${post.likes} likes",
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}
