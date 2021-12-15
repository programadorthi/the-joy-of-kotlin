package dev.programadorthi

// Integer Unary Operator
typealias IntUnaryOp = (Int) -> Int

val square: IntUnaryOp = { it * it }
val triple: IntUnaryOp = { it * 3 }

val compose: (IntUnaryOp) -> (IntUnaryOp) -> IntUnaryOp =
    { f -> { g -> { h -> f(g(h)) } } }
