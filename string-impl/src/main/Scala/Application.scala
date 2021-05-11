class Application {
  var obj = new StringFunctions
}

object main{
  def main(args: Array[String]): Unit = {
    val obj = new Application
    println("string reverse : " + obj.obj.reverseString("RAHUL"))
    println("string length  : " + obj.obj.length("RAHUL"))
  }}