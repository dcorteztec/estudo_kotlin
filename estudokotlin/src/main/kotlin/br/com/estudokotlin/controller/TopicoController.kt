package br.com.estudokotlin.controller

import br.com.estudokotlin.model.Topico
import br.com.estudokotlin.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(
        private val service: TopicoService
) {

    @GetMapping
    fun listar(): List<Topico>{
        return service.listar();
    }
}