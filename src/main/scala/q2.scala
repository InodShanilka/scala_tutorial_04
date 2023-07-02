import scala.io.StdIn.readInt
object q2 {
  def main(args: Array[String]): Unit ={
    print("Enter a number : ")
    val number = readInt()
    print(s"$number is " + output(number))
  }

  def output(number: Int): String = number match {
    case x if x < 0 => "a negative number"
    case x if x == 0 => "zero"
    case x if x%2 == 0 => "a even number"
    case x if x%2 != 0 => "a odd number"
  }
}
