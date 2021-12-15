package dev.programadorthi

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldBeEqualIgnoringCase
import kotlin.random.Random
import kotlin.random.nextULong

class Exercise9Test : FunSpec({
    val random = Random.Default

    repeat(6) {
        test("curried $it") {
            val a = random.nextInt()
            val b = random.nextDouble(until = Double.MAX_VALUE)
            val c = random.nextULong().toString()
            val d = random.nextBoolean()
            val result = curried<Int, Double, String, Boolean>()(a)(b)(c)(d)
            result shouldBeEqualIgnoringCase "$a, $b, $c, $d"
        }
    }
})
