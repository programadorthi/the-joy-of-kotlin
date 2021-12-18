package dev.programadorthi

fun append(s: String, c: Char): String = "$s$c"

fun prepend(s: String, c: Char): String = "$c$s"

fun toString(list: List<Char>): String {
    tailrec fun toString(list: List<Char>, s: String): String = when {
        list.isEmpty() -> s
        else -> toString(list.tail(), append(s, list.head()))
    }
    return toString(list, "")
}

fun toStringReversed(list: List<Char>): String {
    tailrec fun toString(list: List<Char>, s: String): String = when {
        list.isEmpty() -> ""
        else -> toString(list.tail(), prepend(s, list.head()))
    }
    return toString(list, "")
}