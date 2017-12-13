package com.krisdrum.hashmap.shortestWordDistance2
import org.scalatest.{FlatSpec, Matchers}

class ShortestWordDistance2Spec extends FlatSpec with Matchers {
  val shortestWordDistance = new ShortestWordDistance2(List("a", "b", "c", "d", "b"))

  "getDistance" should "return correct value for existing words" in {
    shortestWordDistance.getDistance("a", "b") shouldEqual 1
    shortestWordDistance.getDistance("b", "a") shouldEqual 1
    shortestWordDistance.getDistance("d", "b") shouldEqual 1
  }

  "getDistance" should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException]{
      shortestWordDistance.getDistance("a", "1b")
      shortestWordDistance.getDistance("b1", "a")
      shortestWordDistance.getDistance("d1", "b1")
    }
  }
}
