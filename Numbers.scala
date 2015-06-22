object Numbers
{
  def main(args: Array[String])
  {
  	// Basic math operations
  	println("Addition: " + (3 + 2) )
  	println("Subtraction: " + (3 - 2) )
  	println("Multiplication: " + (3 * 2) )
  	println("Division: " + (3 / 2) )

  	// Integer division results in a truncated, integer answer
  	println("Division with Doubles: " + (3 / 2.0) )

  	// Combining math operations
  	val numOne = 1 + (3 / 2.0) * 4

  	// The operators are actually functions!
  	// Note: "1." will get interpreted as a double instead of a function call
  	val numTwo = (1).+( ( (3)./(2.0) ).*(4) )

  	// Are the two values equal?
  	println("Is numOne == numTwo ?: " + (numOne == numTwo))
  }
}