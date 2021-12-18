package dev.programadorthi

fun append(s: String, c: Char): String = "$s$c"

fun prepend(s: String, c: Char): String = "$c$s"

fun string(list: List<Char>): String =
    foldLeft(list, "", ::append)

fun stringReversed(list: List<Char>): String =
    foldLeft(list, "", ::prepend)