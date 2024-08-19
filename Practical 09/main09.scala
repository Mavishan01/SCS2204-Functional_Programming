import Q9_01.calculateInterest
import Q9_02.PatternMatching
import Q9_03.formatNames
import Q9_03.toUpper
import Q9_03.toLower

object Q09_Main{
    def main(args: Array[String]): Unit = {

        // println(calculateInterest(10000))
        // PatternMatching()

        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        //println(formatNames(names(0)) (toUpper))  //BENNY
        //println(formatNames(names(1)) (name => toUpper(name.substring(0,2)) + toLower(name.substring(2))))  //NIroshan
        //println(formatNames(names(2)) (toLower))  //saman
        //println(formatNames(names(3)) (name => name.substring(0,5) + toUpper(name.last.toString)))  //KumarA
    }
}