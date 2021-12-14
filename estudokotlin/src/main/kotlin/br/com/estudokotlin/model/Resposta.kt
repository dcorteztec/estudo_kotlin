package br.com.estudokotlin.model

import java.time.LocalDateTime

data class Resposta (
        val id: Long? = null,
        val titulo: String,
        val mensagem: String,
        val dataCriacao: LocalDateTime = LocalDateTime.now(),
        val autor: Usuario,
        val topico: Topico,
        val solucao: Boolean,
        )
