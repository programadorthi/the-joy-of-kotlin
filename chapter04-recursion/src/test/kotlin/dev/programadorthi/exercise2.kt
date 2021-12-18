package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise2Test : FunSpec({
    repeat(30) {
        test("factorial $it") {
            val number = it + 1 // repeat is 0 <= value < times
            val factorial = factorial(number + 1)
            factorial shouldBeExactly factorial(number) * (number + 1)
        }
    }
})
