import scala.io.StdIn.readInt
object q1 {
  def main(args: Array[String]): Unit = {
    print("Enter the amount : ")
    val amount = readInt()
    println("Interest per year = " + interest(amount))
  }

  def interest(amount: Int): Double = amount match {
    case x if x < 20000 => x*0.02
    case x if x < 200000 => x*0.04
    case x if x < 2000000 => x*0.035
    case x if x >= 2000000 => x*0.065
  }
}

