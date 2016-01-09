package in.edureka.demo

/**
 * Created by venki on 1/9/16.
 */
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello world");

    /*
    val VS var
     */
    val valSize:Int = 10;
    var varSize:Int = 10;

    varSize = varSize + 1;
//    valSize = valSize + 1;

    /*
    Type inference
     */
    val members = 10;
    println(members.getClass())

    /*
    Expression everywhere
     */
    val exp = {
      val a = 10;
      val b = 20;
      a+b;
    }
    println(exp)

    /*
    Lazy values
     */

    val normalVal = {
      println("---- Initializing normal value ---");
      "normal"
    }

    lazy val lazyVal = {
      println("---- Initializing lazy value ---");
      "lazy"
    }

    println("Accessing normal value");
    println(normalVal);

    println("Accessing lazy value");
    println(lazyVal)


  }

}
