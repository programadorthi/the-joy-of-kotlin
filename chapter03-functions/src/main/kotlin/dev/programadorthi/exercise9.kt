package dev.programadorthi

fun <A, B, C, D> curried(): (A) -> (B) -> (C) -> (D) -> String =
    { a -> { b -> { c -> { d -> "$a, $b, $c, $d" } } } }
