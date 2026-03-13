package com.ejemplo_proyecto.instagramclone.data

import com.ejemplo_proyecto.instagramclone.model.Post
import com.ejemplo_proyecto.instagramclone.model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "maria_garcia",
            profileImageUrl = "https://picsum.photos/seed/user1/100/100",
            imageUrl = "https://picsum.photos/seed/post1/600/600",
            likes = 1243,
            caption = "Disfrutando del atardecer en la playa 🌅",
            isLiked = false
        ),
        Post(
            id = 2,
            username = "carlos_dev",
            profileImageUrl = "https://picsum.photos/seed/user2/100/100",
            imageUrl = "https://picsum.photos/seed/post2/600/600",
            likes = 879,
            caption = "Nuevo proyecto terminado. ¡A seguir aprendiendo!",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "laura_foto",
            profileImageUrl = "https://picsum.photos/seed/user3/100/100",
            imageUrl = "https://picsum.photos/seed/post3/600/600",
            likes = 3412,
            caption = "La ciudad nunca duerme 🏙️",
            isLiked = false
        ),
        Post(
            id = 4,
            username = "andres_viajes",
            profileImageUrl = "https://picsum.photos/seed/user4/100/100",
            imageUrl = "https://picsum.photos/seed/post4/600/600",
            likes = 654,
            caption = "Explorando nuevos caminos en las montañas ⛰️",
            isLiked = false
        ),
        Post(
            id = 5,
            username = "sofia_cook",
            profileImageUrl = "https://picsum.photos/seed/user5/100/100",
            imageUrl = "https://picsum.photos/seed/post5/600/600",
            likes = 2187,
            caption = "Receta del día: pasta al pesto casero 🍝",
            isLiked = true
        ),
        Post(
            id = 6,
            username = "miguel_arte",
            profileImageUrl = "https://picsum.photos/seed/user6/100/100",
            imageUrl = "https://picsum.photos/seed/post6/600/600",
            likes = 987,
            caption = "Nuevo cuadro terminado. ¿Qué les parece?",
            isLiked = false
        ),
        Post(
            id = 7,
            username = "valentina_fit",
            profileImageUrl = "https://picsum.photos/seed/user7/100/100",
            imageUrl = "https://picsum.photos/seed/post7/600/600",
            likes = 4521,
            caption = "Día de entrenamiento completado 💪 #fitness",
            isLiked = false
        ),
        Post(
            id = 8,
            username = "pedro_music",
            profileImageUrl = "https://picsum.photos/seed/user8/100/100",
            imageUrl = "https://picsum.photos/seed/post8/600/600",
            likes = 1102,
            caption = "Ensayo de la banda. ¡Pronto nuevo single! 🎸",
            isLiked = true
        ),
        Post(
            id = 9,
            username = "isabela_nature",
            profileImageUrl = "https://picsum.photos/seed/user9/100/100",
            imageUrl = "https://picsum.photos/seed/post9/600/600",
            likes = 763,
            caption = "El bosque en otoño es simplemente mágico 🍂",
            isLiked = false
        ),
        Post(
            id = 10,
            username = "juan_arquitecto",
            profileImageUrl = "https://picsum.photos/seed/user10/100/100",
            imageUrl = "https://picsum.photos/seed/post10/600/600",
            likes = 2340,
            caption = "Diseño final aprobado. ¡Gran proyecto! 🏛️",
            isLiked = false
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(
            id = 1,
            username = "maria_garcia",
            imageUrl = "https://picsum.photos/seed/story1/200/200",
            hasSeen = false
        ),
        Story(
            id = 2,
            username = "carlos_dev",
            imageUrl = "https://picsum.photos/seed/story2/200/200",
            hasSeen = true
        ),
        Story(
            id = 3,
            username = "laura_foto",
            imageUrl = "https://picsum.photos/seed/story3/200/200",
            hasSeen = false
        ),
        Story(
            id = 4,
            username = "andres_viajes",
            imageUrl = "https://picsum.photos/seed/story4/200/200",
            hasSeen = false
        ),
        Story(
            id = 5,
            username = "sofia_cook",
            imageUrl = "https://picsum.photos/seed/story5/200/200",
            hasSeen = true
        ),
        Story(
            id = 6,
            username = "miguel_arte",
            imageUrl = "https://picsum.photos/seed/story6/200/200",
            hasSeen = false
        ),
        Story(
            id = 7,
            username = "valentina_fit",
            imageUrl = "https://picsum.photos/seed/story7/200/200",
            hasSeen = true
        )
    )
}
