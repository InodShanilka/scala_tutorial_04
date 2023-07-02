object q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper))
  }

  def toUpper(str: String): String = {
    var Upp_str = ""
    for (i <- str){
      if (i.toInt > 96 && i.toInt <123) Upp_str += (i.toInt - 32).toChar
      else Upp_str += i
    }
    return Upp_str
  }

  def toLower(str : String): String = {
    var Low_str = ""
    for (i <- str){
      if (i.toInt > 64 && i.toInt < 91) Low_str += (i.toInt + 32).toChar
      else Low_str += i
    }
    return Low_str
  }

  def formatNames(name: String, call_Function: String => String) = call_Function(name)

}
