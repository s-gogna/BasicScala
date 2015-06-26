object NestedFunctions
{
  def main(args: Array[String])
  {
    // What is the square root of 144?
    println( "Square root of 144 is " + sqrtWithNewtonsMethods(144.0) )
  }

  // Define a function that takes one parameter of type Double
  // and returns another Double which is the square root
  def sqrtWithNewtonsMethods(value: Double) =
  {
    // This function checks if the guess is close enough or if another
    // iteration is needed
    def iterate(guess: Double): Double = 
    {
      if (isClose(guess)) guess else iterate(next(guess))
    }

    // This function defines what is or isn't a close enough guess
    def isClose(currentGuess: Double) =
    {
      abs(square(currentGuess) - value) < 0.001
    }

    // This function computes the next guess to try
    def next(currentGuess: Double) =
    {
      (currentGuess + (value / currentGuess)) / 2.0
    }

    // This is a function call to nested function
    // Since value was passed in at a higher scope, it is "visible" to
    // all the nested function defintions
    iterate(1.0)
  }

  def square(value: Double) = value * value

  def abs(value: Double) = if (value >= 0.0) value else -value
}
