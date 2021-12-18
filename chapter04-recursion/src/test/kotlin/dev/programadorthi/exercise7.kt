package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Exercise7Test : FunSpec({
    repeat(6) { n ->
        test("reverse $n") {
            val list1 = Array(n) { n + 1 }.toList()
            val list2 = Array(n) { n + 2 }.toList()
            reverse(list1 + list2) shouldBe reverse(list2) + reverse(list1)
        }
    }
})
