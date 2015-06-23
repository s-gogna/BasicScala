object StringInterpolation
{
  def main(args: Array[String])
  {
  	// Initialize some values
  	val alpha = 5.2
  	val beta = "BetaString!"

    // Adding the 's' in front of a string literal like this allows
    // the programmer to add in variables names and expressions which 
    // will be replaced ('s' is Scala version 2.10+)
    println( s"The value of alpha was interpolated as $alpha" )
    println( s"The value of beta was interpolated as $beta" )
    println( s"It can also do math! What is 3 * 12? ${3 * 12}" )

    // If you're familiar with C's printf or Java's string format,
    // Scala also supports that with 'f' instead of 's'. Additionally,
    // using 'f' is type safe ('f' is Scala version 2.10+)
    println( f"Displaying alpha as an integer ... $alpha%i" )
    println( f"Displaying alpha as with options for floats ... $alpha%2.5f" )
  }
}
