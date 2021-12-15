package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly

class Exercise3Test : FunSpec({
    repeat(6) {
        test("adding $it") {
            add(it)(it) shouldBeExactly it + it
        }
    }
})
