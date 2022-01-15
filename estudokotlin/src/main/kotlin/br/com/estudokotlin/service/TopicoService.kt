package br.com.estudokotlin.service

import br.com.estudokotlin.dto.NovoTopicoForm
import br.com.estudokotlin.dto.TopicoView
import br.com.estudokotlin.mapper.TopicoFormMapper
import br.com.estudokotlin.mapper.TopicoViewMapper
import br.com.estudokotlin.model.Curso
import br.com.estudokotlin.model.Topico
import br.com.estudokotlin.model.Usuario
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map {
                t -> topicoViewMapper.map(t)
        }.collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(form: NovoTopicoForm) {
        val topico = topicoFormMapper.map(form)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topico)
    }
}