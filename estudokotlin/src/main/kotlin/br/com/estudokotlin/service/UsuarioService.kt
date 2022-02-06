package br.com.estudokotlin.service

import br.com.estudokotlin.model.Usuario
import br.com.estudokotlin.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService (private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }


}