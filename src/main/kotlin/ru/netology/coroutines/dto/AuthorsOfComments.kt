package ru.netology.coroutines.dto

data class AuthorsOfComments (
    val post: Post,
    val author: List<Author>,
    val comments: List<Comment>,
)
