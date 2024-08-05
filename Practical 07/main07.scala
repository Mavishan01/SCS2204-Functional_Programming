import Q7_01.filterEvenNumbers
import Q7_02.calculateSquare
import Q7_03.filterPrime

object Q06_Main{
    def main(args: Array[String]): Unit = {

        val numbersList = List(1,2,3,4,5,6,7,8,9,10) 

        println(filterEvenNumbers(numbersList))
        println(calculateSquare(numbersList))
        println(filterPrime(numbersList))
    }
}