package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise2Test : FunSpec({
    repeat(30) {
        test("factorial $it") {
            val factorial = factorial(it + 1)
            factorial shouldBeExactly factorial(it) * (it + 1)
        }
    }
})
