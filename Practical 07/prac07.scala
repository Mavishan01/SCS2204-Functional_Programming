import scala.math

object Q7_01{
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        val lambda1 = (x:Int) => x%2 == 0 
        numbers.filter(lambda1)
    }
}

object Q7_02{
    def calculateSquare(numbers: List[Int]): List[Int] = {
        val lambda2 = (x:Int) => x*x
        numbers.map(lambda2)
    }
}

object Q7_03{
    def filterPrime(numbers: List[Int]): List[Int] = {
        val lambda3: Int => Boolean = (x: Int) => {

        if (x <= 1) false
        else if (x == 2) true
        else {
            val sqrtX = Math.sqrt(x).toInt
            (2 to sqrtX).forall(i => x % i != 0)
        } 
        }
        numbers.filter(lambda3)
    }
}        