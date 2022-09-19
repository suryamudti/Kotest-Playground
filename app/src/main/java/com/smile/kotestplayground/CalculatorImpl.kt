package com.smile.kotestplayground

import com.smile.kotestplayground.Calculator

class CalculatorImpl : Calculator {
    override fun plus(a: Int, b: Int) = (a + b).toDouble()
    override fun minus(a: Int, b: Int) =  (a - b).toDouble()
    override fun multiply(a: Int, b: Int) = (a * b).toDouble()
    override fun divide(a: Int, b: Int) = (a / b).toDouble()
}