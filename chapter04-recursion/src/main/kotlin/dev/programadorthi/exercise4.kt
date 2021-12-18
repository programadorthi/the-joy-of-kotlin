package dev.programadorthi

fun <T> makeString(list: List<T>, delim: String): String =
    foldLeft(list, "") { s, t ->
        if (s.isEmpty()) "$t" else "$s$delim$t"
    }