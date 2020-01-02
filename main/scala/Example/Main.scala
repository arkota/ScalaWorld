package Example

object Main extends App{
  val ages = Seq(42,88,29,64)
  println(s"The oldest person is ${ages.max}")
  println("doing some more commits from branch")
  val fromCmd = scala.io.StdIn.readLine()
  println(s"the user put in ${fromCmd}")
  CubeIt.cube(3)
}
