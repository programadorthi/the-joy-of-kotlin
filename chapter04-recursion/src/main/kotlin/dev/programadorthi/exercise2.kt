package dev.programadorthi

val factorial: (Int) -> Int by lazy {
    { n -> if (n <= 1) n else n * factorial(n - 1) }
}
