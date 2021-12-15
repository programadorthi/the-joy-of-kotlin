package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise6Test : FunSpec({
    repeat(6) {
        test("higher and then $it") {
            val compose = higherAndThen<Int, Int, Int>()(::square)(::triple)(it)
            val square = triple(square(it))
            compose shouldBeExactly square
        }
    }
})
