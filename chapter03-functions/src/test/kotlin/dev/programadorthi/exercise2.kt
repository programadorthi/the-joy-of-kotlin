package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise2Test : FunSpec({
    repeat(6) {
        test("composing $it") {
            val compose = compose(::square, ::triple)(it)
            val square = square(triple(it))
            compose shouldBeExactly square
        }
    }
})
