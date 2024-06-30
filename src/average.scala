object average{
  def mean(x:Int,y:Int):Double = (x+y)/2.0

  def main(args:Array[String]):Unit={
    val x = 8
    val y = 13
    val out = mean(x,y)
    println(f"Average is : $out%.2f")
  }
}