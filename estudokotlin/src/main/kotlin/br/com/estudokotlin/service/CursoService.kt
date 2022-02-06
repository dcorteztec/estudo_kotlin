package br.com.estudokotlin.service

import br.com.estudokotlin.model.Curso
import br.com.estudokotlin.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }


}