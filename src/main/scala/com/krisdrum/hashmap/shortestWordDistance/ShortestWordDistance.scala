package com.krisdrum.hashmap.shortestWordDistance

object ShortestWordDistance {
  def getDistance(words: List[String], word1: String, word2: String): Int = {
    var w1_idx: Int = -1
    var w2_idx: Int = -1
    var min: Int = Int.MaxValue

    words.zipWithIndex.foreach{ case (word, index) =>
      if (word == word1) {
        w1_idx = index
        if (w2_idx != -1) min = Math.min((w1_idx - w2_idx).abs, min)
      } else if (word == word2) {
        w2_idx = index
        if (w1_idx != -1) min = Math.min((w1_idx - w2_idx).abs, min)
      }
    }
    min
  }
}
