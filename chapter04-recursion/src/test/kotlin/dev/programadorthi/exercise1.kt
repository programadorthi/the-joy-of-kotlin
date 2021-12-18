package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise1Test : FunSpec({
    repeat(6) {
        test("addition $it") {
            val addition = add(it, it)
            addition shouldBeExactly it + it
        }
    }
})
