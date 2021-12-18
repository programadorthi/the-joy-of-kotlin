package dev.programadorthi

fun append(s: String, c: Char): String = "$s$c"

fun prepend(c: Char, s: String): String = "$c$s"

/*fun string(list: List<Char>): String =
    foldLeft(list, "", ::append)*/

fun string(list: List<Char>): String =
    foldRight(list, "", ::prepend)