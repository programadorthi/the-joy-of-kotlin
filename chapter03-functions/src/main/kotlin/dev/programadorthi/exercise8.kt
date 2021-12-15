package dev.programadorthi

fun <F, G, H> partialB(
    value: G,
    f: (F) -> (G) -> H
): (F) -> H = { a -> f(a)(value) }
