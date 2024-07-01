object Q3_01{
    var reversedString = ""

    def reverse(string: String): String = { 
        var length = string.length

        if(length == 0){
            reversedString
        }
        else{
                reversedString = reversedString + string.substring(length-1)
                reverse(string.substring(0, string.length -1))
            }
    }
}

object Q3_02{
    def biggerStrings(stringArray : Array[String]): Array[String] = {
        var array = Array[String]()

        for(i <- 0 to stringArray.length-1){
            if(stringArray(i).length > 5){
                array = array ++ Array(stringArray(i))
            }
        }
        array
    }
}

object Q3_03{
    def mean(num1: Int, num2: Int): Float = {
        var mean = (num1.toFloat + num2.toFloat)/2
        mean
    }
}

object Q3_04{
    def sumOfEven(intlist: List[Int]): Int = {
        var evenNumberSum = 0

        for(i <- 0 to intlist.length-1){
            if(intlist(i) % 2 == 0){
                evenNumberSum += intlist(i)
            }
        }
        evenNumberSum
    }
}