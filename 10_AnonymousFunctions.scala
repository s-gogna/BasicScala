object AnonymousFunctions
{
  def main(args: Array[String])
  {
    // Instead of creating a function to pass, we can use anonymous functions
    // that perform the same work
    doSomethingToFive("After anonymous addTen, the value is ", (value: Int) => value + 10 )
    doSomethingToFive("After anonymous multiplyByTwenty, the value is ", (value: Int) => value * 20 )
    doSomethingToFive("After anonymous subtractThree, the value is ", (value: Int) => value - 3 )
  }

  // This function, "doSomethingToFive", takes another function, "funct", which
  // is applied to the value 5 and then prints out the result
  def doSomethingToFive(prefixString: String, funct: Int => Int) : Unit = 
  {
    println( prefixString + funct(5) )
  }
}
