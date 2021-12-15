package dev.programadorthi

val square: (Int) -> Int = { it * it }
val triple: (Int) -> Int = { it * 3 }

val compose: ((Int) -> Int) -> ((Int) -> Int) -> (Int) -> Int =
    { f -> { g -> { h -> f(g(h)) } } }
