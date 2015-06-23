object Recursion
{
  def main(args: Array[String])
  {
    // Take the factorial of 4
    println( "factorial(4) is " + factorial(4) )
    println( "factorial(0) is " + factorial(0) )
    println( "factorial(10) is " + factorial(10) )
  }

  // Recursion is when the function has a call to itself in its
  // definition. It must have a condition where it stops calling
  // itself in order to stop and complete.
  def factorial(value: Int) : Int = 
  {
    if (value <= 1) 1 else value * factorial(value - 1)
  }
}
