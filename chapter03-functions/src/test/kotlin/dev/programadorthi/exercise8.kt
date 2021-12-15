package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.doubles.shouldBeExactly
import kotlin.random.Random

class Exercise8Test : FunSpec({
    val random = Random.Default
    val f = { a: Int -> { b: Double -> a * (1 + b / 100) } }

    repeat(6) {
        test("partialA $it") {
            val number = random.nextDouble(until = Double.MAX_VALUE)
            val result = partialB(it, f)(number)
            result shouldBeExactly f(it)(number)
        }
    }
})
