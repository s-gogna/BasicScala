object Sets 
{
  def main(args: Array[String])
  {
    // Sets are a collection without repeated elements
    val alpha = scala.collection.immutable.Set("Apple", "Banana", "Banana")
    println(alpha)

    // Adding elements is possible with the + operator
    val beta = alpha + "Cherry"
    println("Set beta is " + beta)

    // For mutable sets, the += operator is available
    val gamma = scala.collection.mutable.Set("Apple", "Banana", "Banana")
    gamma += "Cherry"
    println("Set gamma is " + gamma)

    // Checking if a set contains an element is done with .contains()
    println("Does beta contain Apple? " + alpha.contains("Apple"))

    // If you only need the mutable version of Set, you must add
    // "import scala.collection.mutable.Set" to the file
    // If you only need the immutable version of Set, you do not
    // need to import
    // The "scala.collection.immutable/mutable" prefix is only needed
    // when both are required in the file
  }
}