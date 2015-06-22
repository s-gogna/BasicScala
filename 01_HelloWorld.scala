// For now, it's enough to know that "object" creates a Singleton
object HelloWorld
{
  // Main function takes an array of strings and gives it the name "args"
  // This is similar to Java's "public static void main(String[] args)"
  def main(args: Array[String])
  {
  	// Unlike Java's System.out.println(), Scala has println()
    println("Hello World!")
  }
}
