object ConditionalExpression
{
  def main(args: Array[String])
  {
    // Use the functions
    println("neverNegative(5) is " + neverNegative(5))
    println("neverNegative(0) is " + neverNegative(0))
    println("neverNegative(-3) is " + neverNegative(-3))

    println("printSign(2.2) is " + printSign(2.2))
    println("printSign(0) is " + printSign(0))
    println("printSign(-5.7) is " + printSign(-5.7))
  }

  // Define a function that takes one parameter of type Int and returns
  // the value if it is greater than 0 or returns 0 if not
  // This is equivalent to the ternary operator in other languages like Java and C
  def neverNegative(value: Int) = if (value > 0) value else 0

  // Define a function that takes one parameter of type Double and returns
  // if it is positive or negative
  def printSign(value: Double) = if (value < 0) "Negative" else "Positive"
}
