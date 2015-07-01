object Lists 
{
  def main(args: Array[String])
  {
    // How do you make a list of integers?
    val alpha = List(1, 2, 3)
    val beta = List(4, 5)

    // How do I concatenate lists?
    println("Concatenation of alpha and beta is " + (alpha ::: beta))

    // By default, Scala uses the immutable lists
    // As you will see from the output, alpha and beta were not modified
    println("List alpha is " + alpha)
    println("List beta is " + beta)

    // Can a list with different types be created?
    // Yes and it will have the lowest shared type (such as Any)
    val gamma = List(1, 2.0, "3", true)
    println("List gamma is " + gamma)

    // The :: operator is used to prepend one element with a list
    // The single element is refered to as the "head" and the trailing
    // list is called the "tail"
    val delta = 0 :: alpha
    println("List delta is " + delta)

    // Using the :: operator (also known as "cons") to create a list
    // It will operate as   Nil.::(3.::(2.::(1.::(0))))
    // This is different than normally expected because the method
    // is being called by the right operand
    val epsilon = 0 :: 1 :: 2 :: 3 :: Nil
    println("List epsilon is " + epsilon)
    println("Epsilon head is " + epsilon.head)
    println("Epsilon tail is " + epsilon.tail)
    println("Epsilon reversed is " + epsilon.reverse)
    println("Epsilon filtered is " + epsilon.filter(n => n > 2))

    // There are many other functions that can be called with lists.
    // For a list, refer to the Scala documentation on immutable
    // and mutable lists
  }
}