package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.doubles.shouldBeExactly
import io.kotest.matchers.string.shouldBeEqualIgnoringCase
import kotlin.random.Random
import kotlin.random.nextULong

class Exercise10Test : FunSpec({
    val random = Random.Default
    val f = { a: Int, b: Double -> a * (1 + b / 100) }

    repeat(6) {
        test("curry $it") {
            val a = random.nextInt()
            val b = random.nextDouble(until = Double.MAX_VALUE)
            val result = curry(f)(a)(b)
            result shouldBeExactly f(a, b)
        }
    }
})
