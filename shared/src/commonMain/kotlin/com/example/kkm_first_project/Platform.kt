package com.example.kkm_first_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform