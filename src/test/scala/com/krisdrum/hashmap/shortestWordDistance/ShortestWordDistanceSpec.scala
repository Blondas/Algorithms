package com.krisdrum.hashmap.shortestWordDistance
import org.scalatest.{FlatSpec, Matchers}

class ShortestWordDistanceSpec extends FlatSpec with Matchers {
  val list = List("a", "b", "c", "d", "b")

  "getDistance" should "return correct value for existing words" in {
    ShortestWordDistance.getDistance(list, "a", "b") shouldEqual 1
    ShortestWordDistance.getDistance(list, "b", "a") shouldEqual 1
    ShortestWordDistance.getDistance(list, "d", "b") shouldEqual 1
  }

  "getDistance for not existing word" should "return Int.MaxValue" in {
      ShortestWordDistance.getDistance(list, "pies1", "dupa") shouldEqual Int.MaxValue
      ShortestWordDistance.getDistance(list, "pies", "dupa1") shouldEqual Int.MaxValue
      ShortestWordDistance.getDistance(list, "pies1", "dupa1") shouldEqual Int.MaxValue
  }
}
