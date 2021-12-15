package dev.programadorthi

fun <A, B, C> compose(
    f: (B) -> C,
    g: (A) -> B
): (A) -> C = { x ->
    f(g(x))
}
