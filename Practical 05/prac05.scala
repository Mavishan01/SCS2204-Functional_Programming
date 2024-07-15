import scala.compiletime.ops.string
object Q5_01{
    var productList = List[String]()

    def getProductList():  List[String] = {
        var continue = true

        while (continue){
            var product = scala.io.StdIn.readLine()

            product match{
                case "done" => continue = false
                case x =>
                    var temp = List(product)
                    productList = productList ++ temp
            }
        }
        productList
    }

    def printProductList(list: List[String]): Unit = {
        var index = 1
        for (i <- list){
            println(index + " - " + i)
            index += 1
        }
    }

    def getTotalProducts(list: List[String]): Int = {
        list.size
    }
}

object Q5_02{
    case class Book(title: String, author: String, isbn: String)

    val book1 = Book("book01", "author01", "00001")
    val book2 = Book("book02", "author02", "00002")
    val book3 = Book("book03", "author03", "00003")

    var books = Set(book1, book2, book3)

    def addBook(title: String, author: String, isbn: String): Unit = {
        val tempBook = Book(title, author, isbn)
        books = books + tempBook

        println(books)
    }

    def removeBook(isbn: String): Unit = {
        for (i <- books){
            if(i.isbn == isbn){
                books = books - i
            }
        }
        println(books)
    }

    def checkBook(isbn: String): Unit = {
        for (i <- books){
            if(i.isbn == isbn){
                println("Book found")
            }
        }    
    }
}

object Q5_03{
    var numbers: Array[Int] = Array()

    def Fibonacci(n: Int): Int = n match{
        case 0 => 0
        case 1 => 1
        case x => Fibonacci(n-1) + Fibonacci(n-2)
    }

    def FibonacciPrint(n: Int): Unit = n match{
        case 0 =>{
           println(0)
        }
        case x =>{
            FibonacciPrint(n-1)
            println(Fibonacci(n))
        }
    }
     
}