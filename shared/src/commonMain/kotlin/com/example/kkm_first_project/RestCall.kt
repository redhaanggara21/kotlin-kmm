package com.example.kkm_first_project;

import io.ktor.client.*
import io.ktor.client.engine.cio.*

class RestCall {

    private val client = HttpClient();

    suspend fun fetchDate(): String{
        return client.get<String>{
            url(
                "$baseUrl/post/2"
            )
        }
    }

    companion object {
        private const val baseUrl = "https://jsonplaceholder.typicode.com";
    }



}