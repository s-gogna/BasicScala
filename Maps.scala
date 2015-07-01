object Maps 
{
  def main(args: Array[String])
  {
    // Maps are a collection of key-value pairs
    val alpha = scala.collection.immutable.Map('a' -> "Apple", 'b' -> "Banana", 'c' -> "Cherry")
    println("Map alpha is " + alpha)

    // Adding elements is possible with the + operator
    // For mutable maps, the += operator is available
    val beta = alpha + ('m' -> "Mango")
    println("Map beta is " + beta)

    // For mutable maps, the += operator is available
    val gamma = scala.collection.mutable.Map('a' -> "Apple", 'b' -> "Banana", 'c' -> "Cherry")
    gamma += ('m' -> "Mango")
    println("Map gamma is " + gamma)

    // Accessing a map with a key is done with the apply function
    // Calling object.apply(...) has a shortcut of object(...)
    println("What is a fruit that starts with the letter m? " + beta('m'))

    // If you only need the mutable version of Map, you must add
    // "import scala.collection.mutable.Map" to the file
    // If you only need the immutable version of Map, you do not
    // need to import
    // The "scala.collection.immutable/mutable" prefix is only needed
    // when both are required in the file
  }
}