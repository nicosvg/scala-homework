package example

object Main {

  def main(args: Array[String]): Unit = {
    2+3
    println(Lists.sum(List(1,2,3)))
  }

  def sum(xs: List[Int]): Int = xs.head
  
}