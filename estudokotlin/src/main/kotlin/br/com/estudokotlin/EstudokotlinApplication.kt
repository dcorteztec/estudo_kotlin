package br.com.estudokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EstudokotlinApplication

fun main(args: Array<String>) {
	runApplication<EstudokotlinApplication>(*args)
}
