package br.com.estudokotlin.mapper

import br.com.estudokotlin.dto.NovoTopicoForm
import br.com.estudokotlin.model.Topico
import br.com.estudokotlin.service.CursoService
import br.com.estudokotlin.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
): Mapper<NovoTopicoForm, Topico> {
    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}