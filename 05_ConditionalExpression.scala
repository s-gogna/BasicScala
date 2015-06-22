object ConditionalExpression
{
  def main(args: Array[String])
  {
    // Use the functions
    println("neverNegative(5): " + neverNegative(5))
    println("neverNegative(0): " + neverNegative(0))
    println("neverNegative(-3): " + neverNegative(-3))

    println("printSign(2.2): " + printSign(2.2))
    println("printSign(0): " + printSign(0))
    println("printSign(-5.7): " + printSign(-5.7))
  }

  // Define a function that takes one parameter of type int and returns
  // the value if it is greater than 0 or returns 0 if not
  // This is equivalent to the terniary operator in other languages like Java and C
  def neverNegative(value: Int) = if (value > 0) value else 0

  def printSign(value: Double) = if (value < 0) "Negative" else "Positive"
}