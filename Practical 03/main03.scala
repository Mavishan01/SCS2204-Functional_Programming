object Q3_Main{
    def main(args : Array[String]): Unit = {

        println(Q3_01.reverse("abcde"))

        val array1 = Array("I", "do", "love", "cricket", "and", "movies")
        val array2 = Q3_02.biggerStrings(array1)
        println(array2.mkString(", "))

        println(Q3_03.mean(2,3))

        val numberList = List(1,2,3,4,5,6)
        println(Q3_04.sumOfEven(numberList))
    }
}