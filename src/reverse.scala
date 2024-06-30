object reverse{
  def reverse(x:String):String=x.length()match {
    case 0 => ""
    case _ => reverse(x.tail)+x.head
  }

  def main(args:Array[String]):Unit={
    val str = "Hello everyone"
    println(reverse(str))
  }
}