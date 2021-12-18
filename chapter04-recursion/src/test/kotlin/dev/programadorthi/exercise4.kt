package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldBeEqualIgnoringCase

class Exercise4Test : FunSpec({
    repeat(6) { n ->
        test("make string $n") {
            val list = Array(n) { "$n" }.toList()
            val string = makeString(list, ",")
            string shouldBeEqualIgnoringCase list.joinToString(",")
        }
    }
})
