package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.random.Random

class Exercise3Test : FunSpec({
    val random = Random.Default

    repeat(100) {
        test("fibonacci $it") {
            val n = random.nextInt(3, 30_000)
            val fibonacci = fib(n)
            fibonacci shouldBe fib(n - 1) + fib(n - 2)
        }
    }
})
