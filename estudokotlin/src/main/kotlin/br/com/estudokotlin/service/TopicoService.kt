package br.com.estudokotlin.service

import br.com.estudokotlin.model.Curso
import br.com.estudokotlin.model.Topico
import br.com.estudokotlin.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
                id = 1,
                titulo = "Duvida Kotlin",
                mensagem = "Variaveis no Kotlin",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da Silva",
                        email = "ana@email.com"
                )
        )

        val topico2 = Topico(
                id = 2,
                titulo = "Duvida Kotlin 2",
                mensagem = "Variaveis no Kotlin 2",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da Silva",
                        email = "ana@email.com"
                )
        )

        val topico3 = Topico(
                id = 3,
                titulo = "Duvida Kotlin 3",
                mensagem = "Variaveis no Kotlin 3",
                curso = Curso(
                        id = 1,
                        nome = "Kotlin",
                        categoria = "Programacao"
                ),
                autor = Usuario(
                        id = 1,
                        nome = "Ana da Silva",
                        email = "ana@email.com"
                )
        )

        topicos = Arrays.asList(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }
}