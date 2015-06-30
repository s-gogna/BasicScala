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