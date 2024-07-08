object Q4_01{
    var item:Array[String] = new Array[String](5)
    var quantity:Array[Int] = new Array[Int](5)

    def displayInventory(array1: Array[String], array2: Array[Int]): Unit = {
        for(i <- 0 to array1.length-1){
            println(array1(i) + " - " + array2(i))
        }
    }

    def restockItem(name: String, stockingQuantity: Int): Unit = {
        var found = false

        for(i <- 0 to item.length-1){
            if(name == item(i)){
                quantity(i) += stockingQuantity
                found = true
            }
        }
        if(found == false){
            println("No such item")
        }
    }

    def sellItem(name: String, sellingQuantity: Int): Unit = {
        var found = false

        for(i <- 0 to item.length-1){
            if(name == item(i) && quantity(i) >= sellingQuantity){
                quantity(i) -= sellingQuantity
                found = true
            }
        }
        if(found == false){
            println("No such item or enough quantity to sell")
        }
    }
}

object Q4_02{
    def numberType(num: Int): Unit = num match {
        case x if x<0 => println("Negative")
        case 0 => println("Zero")
        case x if (x%2 == 0) => println("Even number")
        case x => println("Odd number")
    }
}

object Q4_03{
    def toUpper(string: String): String = {
        string.toUpperCase()
    }

    def toLower(string: String): String = {
        string.toLowerCase()
    }

    def formatNames(name: String)(format: String => String): String = {
        format(name)
    }
}