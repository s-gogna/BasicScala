object FunctionParameters
{
  def main(args: Array[String])
  {
    // Use the functions
    val alpha = doubleMyInt(5)
    println("alpha is " + alpha)

    val beta = doubleMyInt(12)
    println("beta is " + beta)

    val gamma = sumOfSquares(2, 3)
    println("gamma is " + gamma)

    // It's not always needed to save the value
    println( "Sum of squares for alpha and beta is: " + sumOfSquares(alpha, beta) )
  }

  // Define a function that takes one parameter of type int and returns
  // twice its value
  def doubleMyInt(value: Int) = value * 2

  // Define a function that takes two parameters of type int and returns
  // the sum of squares
  def sumOfSquares(first: Int, second: Int): Double = (first * first) + (second * second)
}
