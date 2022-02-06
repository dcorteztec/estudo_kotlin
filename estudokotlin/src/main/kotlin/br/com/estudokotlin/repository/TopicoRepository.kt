package br.com.estudokotlin.repository

import br.com.estudokotlin.model.Topico
import org.springframework.data.jpa.repository.JpaRepository

interface TopicoRepository: JpaRepository<Topico, Long> {
}