object Currying
{
  def main(args: Array[String])
  {
    // alpha will have a function assigned to it as a return value from this call
    val alpha = giveMeAFunction( () => 5 )
    alpha("Prefix (", ") Suffix")

    // It's not neccesary to save the returned function to a var or val !
    giveMeAFunction( () => (3 * 6) )("Prefix (", ") Suffix")

    // Let's use the other way to curry. However, this needs the underscore character (which has
    // a special meaning as a placeholder)
    val beta = anotherWayToCurry(18) _
    beta("Prefix (", ") Suffix")

    // Like before, this also works
    anotherWayToCurry(24)("Prefix (", ") Suffix")
  }

  // This takes a function, funct, as a parameter which will be applied to 5
  // and returns another function, printTheResult
  def giveMeAFunction(funct: () => Int): (String, String) => Unit =
  {
    // This function prints the result of calling funct() with programmer specified
    // prefix and suffix strings
    def printTheResult(prefix: String, suffix: String) = 
    {
      println( prefix + funct() + suffix )
    }

    // This the the return value of the function (notice that it itself is a function)
    printTheResult
  }

  // This does the same thing as 'giveMeAFunction'. Notice that is has multiple parentheses
  // for the parameters.
  def anotherWayToCurry(value: Int)(prefix: String, suffix: String) = 
  {
    println(prefix + value + suffix)
  }
}
