import scala.io.StdIn._
object Q4_Main{
    def main(args: Array[String]): Unit = {

        var item: Array[String] = Array("aa", "bb", "cc", "dd", "ee")
        var quantity: Array[Int] = Array(1,2,3,4,5)

        //Q4_01.displayInventory(item, quantity)
        //Q4_02.numberType(readInt())

        val names = List("Benny", "Niroshan", "Saman", "Kumara")
  
        //println(Q4_03.formatNames(names(0))(Q4_03.toUpper)) // BENNY
        //println(Q4_03.formatNames(names(1))(name => name.substring(0,2).toUpperCase() + name.substring(2))) // NIroshan
        //println(Q4_03.formatNames(names(2))(Q4_03.toLower)) // saman
        //println(Q4_03.formatNames(names(3))(name => name.substring(0,5) + name.last.toUpper))// KumarA
    }
}