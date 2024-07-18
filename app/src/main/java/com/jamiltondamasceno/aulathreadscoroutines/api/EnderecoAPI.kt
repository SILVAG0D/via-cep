package com.jamiltondamasceno.aulathreadscoroutines.api

import com.jamiltondamasceno.aulathreadscoroutines.model.EnderecoModel
import retrofit2.Response
import retrofit2.http.GET

interface EnderecoAPI {

    @GET("ws/01001000/json/")
    suspend fun recuperarEndereco() : Response<EnderecoModel>
}