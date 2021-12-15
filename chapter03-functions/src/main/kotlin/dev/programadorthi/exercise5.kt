package dev.programadorthi

fun <F, G, H> higherCompose(): ((G) -> H) -> ((F) -> G) -> (F) -> H =
    { f -> { g -> { h -> f(g(h)) } } }
