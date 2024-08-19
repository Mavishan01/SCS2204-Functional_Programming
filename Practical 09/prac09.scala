object Q9_01{
    def calculateInterest(deposit: Float): Double = {

        val interest1 = (x:Float) => x*2/100
        val interest2 = (x:Float) => x*4/100
        val interest3 = (x:Float) => x*3.5/100
        val interest4 = (x:Float) => x*6.5/100

        if (deposit <= 20000) {interest1(deposit)}
        else if (deposit <= 200000) {interest2(deposit)}
        else if (deposit <= 2000000) {interest3(deposit)}
        else {interest4(deposit)}
    }
}

object Q9_02{
    def PatternMatching(): Unit = {
        val number = scala.io.StdIn.readInt()

        val message1 = (x:Int) => "Negative"
        val message2 = (x:Int) => "Zero"
        val message3 = (x:Int) => "Even"
        val message4 = (x:Int) => "Odd"

        if (number < 0) {println (message1(number))}
        else if (number == 0) {println (message2(number))}
        else if (number % 2 == 0) {println (message3(number))}
        else {println (message4(number))}
    }
}

object Q9_03{
    val toUpper = (string: String) => string.toUpperCase()
    val toLower = (string: String) => string.toLowerCase()
    
    def formatNames(name: String)(format: String => String): String = {
        format(name)
    }
}