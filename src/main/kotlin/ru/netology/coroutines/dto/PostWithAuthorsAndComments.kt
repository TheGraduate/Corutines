package ru.netology.coroutines.dto

data class PostWithAuthorsAndComments(
    val post: Post,
    val author: List<Author>,
    val comments: List<Comment>,
)