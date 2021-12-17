package dev.programadorthi

fun <A, B, C> swapArgs(f: (A) -> (B) -> C): (B) -> (A) -> C =
    { b -> { a -> f(a)(b) } }
