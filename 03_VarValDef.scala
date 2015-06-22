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
  // The extra " : Unit" at the end indicates the return type. A return type of "Unit" is
  // similar to returning "void" in Java or C++. The compiler is often smart enough that
  // you do not need to include it, but it will require it in some cases
  def myFunc: Unit = println("Im in myFunc!")
}
