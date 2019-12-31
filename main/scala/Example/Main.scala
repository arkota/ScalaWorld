package Example

object Main extends App{
  val ages = Seq(42,88,29,64)
  println(s"The oldest person is ${ages.max}")
  println(s"The youngest person is ${ages.min}")
}
