package dev.programadorthi

fun inc(n: Int) = n + 1

fun dec(n: Int) = n - 1

tailrec fun add(a: Int, b: Int): Int {
    if (b == 0) return a
    return add(inc(a), dec(b))
}
