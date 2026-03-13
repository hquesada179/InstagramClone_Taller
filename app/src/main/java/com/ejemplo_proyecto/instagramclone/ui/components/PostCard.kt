package com.ejemplo_proyecto.instagramclone.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ejemplo_proyecto.instagramclone.model.Post

@Composable
fun PostCard(
    post: Post,
    onLikeClick: (Post) -> Unit = {}
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        PostHeader(post = post)
        PostImage(imageUrl = post.imageUrl)
        PostActions(post = post, onLikeClick = onLikeClick)
        PostFooter(post = post)
    }
}

@Composable
private fun PostHeader(post: Post) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = post.profileImageUrl,
            contentDescription = "Avatar de ${post.username}",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
        )

        Text(
            text = post.username,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp)
        )

        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "Mas opciones"
            )
        }
    }
}

@Composable
private fun PostImage(imageUrl: String) {
    AsyncImage(
        model = imageUrl,
        contentDescription = "Imagen del post",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
    )
}

@Composable
private fun PostActions(
    post: Post,
    onLikeClick: (Post) -> Unit
) {
    var isLiked by remember { mutableStateOf(post.isLiked) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Like
        IconButton(onClick = {
            isLiked = !isLiked
            onLikeClick(post)
        }) {
            Icon(
                imageVector = if (isLiked) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                contentDescription = "Like",
                tint = if (isLiked) Color.Red else MaterialTheme.colorScheme.onSurface
            )
        }

        // Comentar
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.ChatBubbleOutline,
                contentDescription = "Comentar"
            )
        }

        // Enviar
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.Send,
                contentDescription = "Enviar"
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        // Guardar
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.BookmarkBorder,
                contentDescription = "Guardar"
            )
        }
    }
}

@Composable
private fun PostFooter(post: Post) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .padding(bottom = 12.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "${post.likes} Me gusta",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(post.username)
                }
                append("  ${post.caption}")
            },
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
