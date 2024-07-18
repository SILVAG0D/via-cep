package com.jamiltondamasceno.aulathreadscoroutines.model

data class EnderecoModel(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: Int,
    val gia: Int,
    val ddd: Int,
    val siafi: Int,
)
