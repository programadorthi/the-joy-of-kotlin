package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise5Test : FunSpec({
    repeat(6) {
        test("curried polymorphic $it") {
            val compose = higherCompose<Int, Int, Int>()(::square)(::triple)(it)
            val square = square(triple(it))
            compose shouldBeExactly square
        }
    }
})
