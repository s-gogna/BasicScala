object FirstClassFunctions
{
  def main(args: Array[String])
  {
    // First class functions are functions that can be passed into other functions
    // and will be treated as objects/variables
    doSomethingToFive("After addTen, the value is ", addTen)
    doSomethingToFive("After multiplyByTwenty, the value is ", multiplyByTwenty)
    doSomethingToFive("After subtractThree, the value is ", subtractThree)
  }

  // This function, "doSomethingToFive", takes another function, "funct", which
  // is applied to the value 5 and then prints out the result
  def doSomethingToFive(prefixString: String, funct: Int => Int) : Unit = 
  {
    println( prefixString + funct(5) )
  }

  def addTen(value: Int): Int = value + 10

  def multiplyByTwenty(value: Int): Int = value * 20

  def subtractThree(value: Int): Int = value - 3
}
