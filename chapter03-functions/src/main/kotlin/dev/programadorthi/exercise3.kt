package dev.programadorthi

// Integer Binary Operator
typealias IntBinOp = (Int) -> (Int) -> Int

val add: IntBinOp = { a -> { b -> a + b } }
val mult: IntBinOp = { a -> { b -> a * b } }
