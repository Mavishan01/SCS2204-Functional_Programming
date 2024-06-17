def area(radius: Int): Double = {
    math.Pi* radius* radius
}

def CtoFahrenheit(celcius: Int): Double = {
    celcius* 1.8 + 32.0
}

def volumn(radius: Int): Double = {
    (4.0/3)* math.Pi* radius* radius* radius
}

def WholesaleCost(books: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4

    def shippingCost(books: Int): Double = {
        if (books <= 50){
            3
        }
        else {
            3 + 0.75* (books - 50)
        }
    }
    (coverPrice* (1-discount) * books) + shippingCost(books)
}

def runningTime(kmEasy: Int, kmTempo: Int): Int = {
    val easyPace = 8
    val tempo = 7

    easyPace* kmEasy + tempo* kmTempo
} 

def main(args: Array[String]): Unit = {
    println("Area : " + area(5));
    println("Temperature : " + CtoFahrenheit(35) + "F")
    println("Volumn : " + volumn(5))
    println("Wholesale cost : " + WholesaleCost(60))
    println("Total running time : " + runningTime(4, 3)) 
}