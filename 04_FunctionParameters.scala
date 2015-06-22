object FunctionParameters
{
  def main(args: Array[String])
  {
    // Use the functions
    val apple = doubleMyInt(5)
    println("Apple is: " + apple)

    val book = doubleMyInt(12)
    println("Book is: " + book)

    val cat = sumOfSquares(2, 3)
    println("Cat is: " + cat)

    // It's not needed to save the value
    println( "Sum of squares for apple and book is: " + sumOfSquares(apple, book) )
  }

  // Define a function that takes one parameter of type int and returns
  // twice its value
  def doubleMyInt(value: Int) = value * 2

  // Define a function that takes two parameters of type int and returns
  // the sum of squares
  def sumOfSquares(first: Int, second: Int) = (first * first) + (second * second)
}