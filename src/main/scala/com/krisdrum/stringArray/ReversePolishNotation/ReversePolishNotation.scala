package com.krisdrum.stringArray.ReversePolishNotation

class ReversePolishNotation(rpn: List[String]) {
  def calculate(argList: List[String] = rpn, stack: List[String] = List.empty): Long = {
    if (argList.isEmpty) stack.head.toLong
    else argList.head match {
        case "+"  =>
          val tail = stack.tail
          calculate(argList.tail, (tail.head.toLong + stack.head.toLong).toString +: tail.tail)
        case "-" =>
          val tail = stack.tail
          calculate(argList.tail, (tail.head.toLong - stack.head.toLong).toString +: tail.tail)
        case "*" =>
          val tail = stack.tail
          calculate(argList.tail, (tail.head.toLong * stack.head.toLong).toString +: tail.tail)
        case "/" =>
          val tail = stack.tail
          calculate(argList.tail, (tail.head.toLong / stack.head.toLong).toString +: tail.tail)
        case i if argList.isEmpty => stack.head.toLong
        case i => calculate(argList.tail, i +: stack)
      }
  }
}
