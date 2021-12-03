package solutions

import scala.io.Source

object Day01 {
  val lines = Source
    .fromResource("day1.txt")
    .getLines
    .map(_.toInt)
    .toSeq

  // https://docs.scala-lang.org/overviews/collections/trait-iterable.html#inner-main
  def part1(input: Seq[Int]) = input.sliding(2).count { case Seq(x, y) => y > x }

  def part2(input: Seq[Int]) = part1(input.sliding(3).map(_.sum).toSeq)

  def main(args: Array[String]): Unit = {
    println(part1(lines))
    println(part2(lines))
  }
}
