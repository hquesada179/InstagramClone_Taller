package com.ejemplo_proyecto.instagramclone.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ejemplo_proyecto.instagramclone.model.Story

@Composable
fun StoriesRow(stories: List<Story>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(stories, key = { it.id }) { story ->
            StoryItem(story = story)
        }
    }
}

@Composable
private fun StoryItem(story: Story) {
    val borderColor = if (story.hasSeen) {
        Color.Gray.copy(alpha = 0.4f)
    } else {
        Color(0xFFE1306C) // rosa Instagram
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AsyncImage(
            model = story.imageUrl,
            contentDescription = "Story de ${story.username}",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .border(width = 2.dp, color = borderColor, shape = CircleShape)
                .padding(3.dp)
                .clip(CircleShape)
        )

        Text(
            text = story.username,
            style = MaterialTheme.typography.labelSmall,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.size(width = 64.dp, height = 16.dp)
        )
    }
}
