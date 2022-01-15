package br.com.estudokotlin.controller

import br.com.estudokotlin.dto.NovoTopicoForm
import br.com.estudokotlin.dto.TopicoView
import br.com.estudokotlin.model.Topico
import br.com.estudokotlin.service.TopicoService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/topicos")
class TopicoController(
        private val service: TopicoService
) {

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody @Valid dto: NovoTopicoForm) {
        service.cadastrar(dto)
    }
}