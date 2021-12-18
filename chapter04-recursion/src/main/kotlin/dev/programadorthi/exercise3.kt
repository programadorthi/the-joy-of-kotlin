package dev.programadorthi

import java.math.BigInteger

fun fib(x: Int): BigInteger {
    tailrec fun fib(
        a: BigInteger,
        b: BigInteger,
        c: BigInteger
    ): BigInteger = when (c) {
        BigInteger.ZERO -> BigInteger.ONE
        BigInteger.ONE -> a + b
        else -> fib(b, a + b, c - BigInteger.ONE)
    }
    return fib(BigInteger.ZERO, BigInteger.ONE, BigInteger.valueOf(x.toLong()))
}
