object Classes
{
  // The keyword "class" defines a class and the definition takes parameters
  // if needed (much like a constructor)
  class ComplexNum(realPart: Double, imaginaryPart: Double)
  {
    // Public values that are assigned on construction
    val real = realPart
    val imag = imaginaryPart

    // Private variable accessible only to the current class/objects of this class
    private var useless = 2.0

    // Protected variable that can be modified by subclasses
    protected var maybeUseless = 3.0

    // Scala's way of defining overloaded constructors
    def this() = this(0.0, 0.0)

    // Definition of an "add" method using the plus operator
    def +(other: ComplexNum) = new ComplexNum(real + other.real, imag + other.imag)

    // Definition of an "subtract" method using the minus operator
    def -(other: ComplexNum) = new ComplexNum(real - other.real, imag - other.imag)

    // Override of the toString method
    override def toString: String = "(" + real + " + " + imag + "i)"
  }

  def main(args: Array[String])
  {
    // Let's build some complex numbers
    val realOne = new ComplexNum(1.0, 0)
    val imagOne = new ComplexNum(0, 1.0)

    // Add and print
    println( realOne + " + " + imagOne + " = " + (realOne + imagOne) )

    // Subtract and print
    println( "(5.0 + 2.0i) - " + realOne + " = " + (new ComplexNum(5.0, 2.0) - realOne) )
  }
}