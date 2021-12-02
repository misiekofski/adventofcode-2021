package day1

import scala.io.Source

object Day1 {

  def main(args: Array[String]): Unit = {
    val lines = Source
      .fromFile("src/day1/input.txt")
      .getLines()
      .map(_.toInt)
      .toSeq

    print(lines.sliding(2).count {case Seq(x,y) => y > x})
  }
}