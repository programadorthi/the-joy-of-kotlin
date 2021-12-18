package dev.programadorthi

fun <T> List<T>.head(): T = when {
    isEmpty() -> throw IllegalArgumentException("head called on empty list")
    else -> this[0]
}

fun <T> List<T>.tail(): List<T> = when {
    isEmpty() -> throw IllegalArgumentException("tail called on empty list")
    else -> drop(1)
}

fun sum(list: List<Int>): Int {
    tailrec fun sumTail(lst: List<Int>, acc: Int): Int = when {
        lst.isEmpty() -> acc
        else -> sumTail(lst.tail(), acc + lst.head())
    }
    return sumTail(list, 0)
}