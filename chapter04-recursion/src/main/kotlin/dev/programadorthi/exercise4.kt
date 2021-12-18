package dev.programadorthi

fun <T> makeString(list: List<T>, delim: String): String {
    tailrec fun corecursive(lst: List<T>, acc: String): String = when {
        lst.isEmpty() -> acc
        acc.isEmpty() -> corecursive(lst.tail(), "${lst.head()}")
        else -> corecursive(lst.tail(), "$acc$delim${lst.head()}")
    }
    return corecursive(list, "")
}
