package com.smile.kotestplayground

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.doubles.shouldBeLessThan
import io.kotest.matchers.shouldBe

internal class CalculatorImplTest : BehaviorSpec({

    lateinit var sut: Calculator

    beforeAny {
        sut = CalculatorImpl()
    }

    Given("a = 10 and b = 20") {
        val a = 10
        val b = 20
        var expectedResult: Double
        var actualResult: Double
        When("a plus b") {
            expectedResult = 30.0
            actualResult = sut.plus(a, b)
            Then("actual should be expected") {
                actualResult shouldBe expectedResult
            }
        }
        When("a minus b") {
            expectedResult = -10.0
            actualResult = sut.minus(a, b)
            Then("actual should be expected") {
                actualResult shouldBe expectedResult
            }
            And("actual should be less than 0") {
                actualResult shouldBeLessThan 0.0
            }
        }
        When("a multiply by b") {
            expectedResult = 200.0
            actualResult = sut.multiply(a, b)
            Then("actual should be expected") {
                actualResult shouldBe expectedResult
            }
        }
        When("a divided by b") {
            expectedResult = 0.0
            actualResult = sut.divide(a, b)
            Then("actual should be expected") {
                actualResult shouldBe expectedResult
            }
        }
    }
})