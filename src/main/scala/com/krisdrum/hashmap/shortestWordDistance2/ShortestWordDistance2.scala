package com.krisdrum.hashmap.shortestWordDistance2

class ShortestWordDistance2(wordList: List[String]) {
  val wordMap: Map[String, List[Int]] = wordList
    .zipWithIndex
    .foldLeft(Map.empty[String, List[Int]]){(map, elem) =>
      map.get(elem._1) match {
        case None => map + (elem._1 -> List(elem._2))
        case Some(value)  => map + (elem._1 -> (value :+ elem._2))
      }
    }

  def getDistance(word1: String, word2: String): Int = {
    val list1: List[Int] = wordMap(word1)
    val list2: List[Int] = wordMap(word2)
    var i, j =0
    var res = Int.MaxValue

    while (i < list1.length && j < list2.length) {
      res = Math.min(res, Math.abs(list1(i) - list2(j)))
      if (list1(i) < list2(j)) i+=1 else j+=1
    }

    res
  }
}
