package solutions

import scala.io.Source
import scala.collection.mutable.ListBuffer

object Day03 {
  val lines = Source
    .fromResource("day3.txt")
    .getLines
    .map(f => f.sliding(1).toList)
    .toList

  def main(args: Array[String]): Unit = {

    var gamma = new ListBuffer[String]()
    var epsilon = new ListBuffer[String]()
    val nums = Seq(0,1,2,3,4,5,6,7,8,9,10,11)

    for (i <- nums) {
      if (lines.count(_(i) == "1")>(lines.length/2)) {
        gamma += "1"
        epsilon += "0"
      } else {
        gamma += "0"
        epsilon += "1"
      }
    }

    val gammaValue = Integer.parseInt(gamma.mkString(""), 2)
    val epsilonValue = Integer.parseInt(epsilon.mkString(""), 2)
    println(gammaValue*epsilonValue)
  }
}
