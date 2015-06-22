object VarValDef
{
  def main(args: Array[String])
  {
    // var is a variable
    var myVar = 5;
    myVar = 6;
    println("myVar is: " + myVar)

    // val is used to set a value once like 'final' in Java
    val myVal = 5;
    // myVal = 6; Creates a compiler error
    println("myVal is: " + myVal)

    // Since the function is defined to not take parameters,
    // you don't need to specify them. In fact, the compiler
    // will give an error if you try to do myFunc()
    myFunc
  }

  // def is used to define a function
  def myFunc = println("Im in myFunc!")
}