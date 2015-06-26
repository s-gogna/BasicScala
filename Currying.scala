object Currying
{
  def main(args: Array[String])
  {
    // alpha will have a function assigned to it as a return value from this call
    val alpha = giveMeAFunction( () => 5 )
    alpha("This is my prefix. (", ") This is my suffix.")

    // It's not neccesary to save the returned function to a var or val !
    giveMeAFunction( () => (3 * 6) )("This is my other prefix. (", ") This is my other suffix.")
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
}
