package br.com.estudokotlin.repository

import br.com.estudokotlin.model.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository: JpaRepository<Curso, Long> {
}