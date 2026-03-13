package com.ejemplo_proyecto.instagramclone.model

data class Story(
    val id: Int,
    val username: String,
    val imageUrl: String,
    val hasSeen: Boolean = false
)
