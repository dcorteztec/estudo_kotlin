package br.com.estudokotlin.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}