package dev.programadorthi

fun <F, G, H> partialA(
    value: F,
    f: (F) -> (G) -> H
): (G) -> H = f(value)
