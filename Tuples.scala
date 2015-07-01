object Tuples 
{
  def main(args: Array[String])
  {
    // Tuples are n-sized pairs of elements
    val alpha = new Tuple2("Ipsum", 5)
    println("Normal tuple constructor: " + alpha)

    // A shortcut to creating a tuple is:
    val beta = ("Ipsum", 5)
    println("Tuple created with shortcut: " + beta)

    // Tuples are not restricted to two elements but there is
    // an upper limit of 22 elements. If you need more than 22
    // elements, a collection is probably a better choice
    val gamma = (1, 4.2, "Hello", 'e', true)
    println("Tuple of 5 elements: " + gamma)

    // Accessing elements in tuples is as simple as a method call
    println("First element of alpha is " + alpha._1)
    println("Third element of gamma is " + gamma._3)
  }
}