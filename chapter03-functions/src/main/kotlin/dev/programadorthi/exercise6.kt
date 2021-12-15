package dev.programadorthi

fun <F, G, H> higherAndThen(): ((F) -> G) -> ((G) -> H) -> (F) -> H =
    { f -> { g -> { h -> g(f(h)) } } }
