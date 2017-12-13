package com.krisdrum.stringArray

import org.scalatest.{FlatSpec, Matchers}

class ReversePolishNotationSpec extends FlatSpec with Matchers {
  val rpn1 = new ReversePolishNotation(List("2", "1", "+", "3", "*"))
  val rpn2 = new ReversePolishNotation(List("4", "13", "5", "/", "+"))

  "calculate" should "return correct value" in {
    rpn1.calculate() shouldEqual 9
    rpn2.calculate() shouldEqual 6
  }
}
