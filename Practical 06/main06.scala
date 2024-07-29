import Q6_01.productNames
import Q6_01.totalValue
import Q6_01.isInventory1Empty
import Q6_01.findProductById

object Q6_Main{
    def main(args: Array[String]): Unit = {

    productNames()
    println(totalValue())
    println(isInventory1Empty())
    findProductById(1001)
    }
}    