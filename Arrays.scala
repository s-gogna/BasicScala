object Arrays 
{
  def main(args: Array[String])
  {
    // How do you make an array of integers?
    val arrayOfInts = new Array[Int](10)

    // How do you make an array of doubles?
    val arrayOfDoubles = new Array[Double](10)

    // How do you set something in an array?
    // Unlike Java, Scala uses (index) instead of [index]
    arrayOfInts(0) = 3
    arrayOfInts(1) = 4
    arrayOfDoubles(3) = 4.2

    // Scala treats the indexing as a function call
    // Indexing can also be done by using the apply() function
    println( "Using apply(), the value in the array is " + arrayOfInts.apply(0) )

    // Using apply() doesn't work for assignment, but there
    // is another function to update the value
    arrayOfInts.update(0, 2)
    println( "After using update(), the value in the array is " + arrayOfInts(0) )

    // How can I print my array?
    for(i <- 0 to 9)
    {
      println( "Array of Ints, index is " + i + " and value is " + arrayOfInts(i) )
    }

    // It is not neccesary to print the entire array
    for(i <- 1 to 4)
    {
      println( "Array of Doubles, index is " + i + " and value is " + arrayOfDoubles(i) )
    }
  }
}