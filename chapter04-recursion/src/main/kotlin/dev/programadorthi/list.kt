package dev.programadorthi

fun <T> List<T>.head(): T = when {
    isEmpty() -> throw IllegalArgumentException("head called on empty list")
    else -> this[0]
}

fun <T> List<T>.tail(): List<T> = when {
    isEmpty() -> throw IllegalArgumentException("tail called on empty list")
    else -> drop(1)
}

fun sum(list: List<Int>): Int =
    foldRight(list, 0, Int::plus)