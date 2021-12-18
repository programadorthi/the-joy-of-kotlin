package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.string.shouldBeEqualIgnoringCase

class Exercise5Test : FunSpec({
    repeat(6) { n ->
        test("string $n") {
            val list = Array(n) { n.toChar() }.toList()
            string(list) shouldBeEqualIgnoringCase list.fold("") { s, c -> s + c }
        }

        test("sum $n") {
            val list = Array(n) { it + n }.toList()
            sum(list) shouldBeExactly list.fold(0) { s, c -> s + c }
        }
    }
})
