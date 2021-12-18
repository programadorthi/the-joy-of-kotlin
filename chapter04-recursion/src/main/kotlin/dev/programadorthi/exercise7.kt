package dev.programadorthi

fun <T> prepend(list: List<T>, elem: T): List<T> =
    listOf(elem) + list

fun <T> reverse(list: List<T>): List<T> =
    foldLeft(list, listOf(), ::prepend)