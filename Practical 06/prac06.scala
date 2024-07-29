import scala.collection.mutable.Map
import scala.math


val inventory1 = Map(1001 -> List("product 1", 5, 500),
                    1002 -> List("product 2", 8, 600),
                    1003 -> List("product 3", 9, 700)  
                )

val inventory2 = Map(1001 -> List("product 1", 1, 500),
                    1002 -> List("product 2", 2, 700),
                    1003 -> List("product 3", 3, 600)  
                )               
object Q6_01{
    def productNames() : Unit = {
        
        for((i,List(j,k,l)) <- inventory1){
            println(j)
        }
    }

    def totalValue(): Int = {
        var total = 0

        for (case (_, List(_, quantity: Int, price: Int)) <- inventory1) {
            total += quantity * price
        }
        total
    }

    def isInventory1Empty(): Boolean = {
        inventory1.isEmpty
    }

    def findProductById(productId: Int): Unit = {

        inventory1.get(productId) match {
            case Some(List(name, quantity, price)) =>
                
            println(s"Product ID: $productId")
            println(s"Name: $name")
            println(s"Quantity: $quantity")
            println(s"Price: $price")

            case None =>
            println(s"Product with ID $productId not found.")
    }
  }
}
