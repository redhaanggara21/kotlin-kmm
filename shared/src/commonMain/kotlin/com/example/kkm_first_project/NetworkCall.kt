package com.example.kkm_first_project

class NetworkCall {

    suspend fun getData(): String {
        var data = RestCall().fetchDate();
        return "Data from api : ${data}!";
    }
}