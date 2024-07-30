import scala.collection.mutable.Map
import scala.math
import scala.io.StdIn.{readLine, readInt}

val inventory1 = Map(1001 -> List("product 1", 5, 500),
                    1002 -> List("product 2", 8, 600),
                    1003 -> List("product 3", 9, 700)  
                )

val inventory2 = Map(1001 -> List("product 1", 1, 400),
                    1002 -> List("product 2", 2, 700),
                    1004 -> List("product 4", 3, 600)  
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

    def merge(): Unit = {
        var merged = scala.collection.mutable.Map[Int, List[Any]]()

        def mergeItem(item: (Int, String, Int, Int)): Unit = {
            var (id, name, quantity, price) = item

            merged.get(id) match {
                case Some(List(name, oldQuantity:Int, oldPrice:Int)) => merged += (id -> List(name, quantity+oldQuantity, math.max(price, oldPrice)))
                case none => merged += (id -> List(name, quantity, price))
            }
        }
        
        inventory1.foreach { case (id, List(name: String, quantity: Int, price: Int)) => mergeItem(id, name, quantity, price) }
        inventory2.foreach { case (id, List(name: String, quantity: Int, price: Int)) => mergeItem(id, name, quantity, price) }
        println(merged)
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

object Q6_02{

    def getStudentInfo(): (String, Int, Int, Double, Char) = {

        println("Enter student's name: ")
        val name = readLine().trim
        println("Enter marks obtained: ")
        val marks = readInt()
        println("Enter total possible marks: ")
        val totalMarks = readInt()
    
        val percentage = (marks.toDouble / totalMarks) * 100
        val grade = calculateGrade(percentage)
    
        (name, marks, totalMarks, percentage, grade)
    }

    def calculateGrade(percentage: Double): Char = {
        percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
        }
    }

    def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
        val (name, marks, totalMarks, percentage, grade) = record

        println(s"Student Name: $name")
        println(s"Marks Obtained: $marks")
        println(s"Total Possible Marks: $totalMarks")
        println(s"Percentage: ${"%.2f".format(percentage)}%")
        println(s"Grade: $grade")
    }

    def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {

        if (name.isEmpty) {
            (false, Some("Name cannot be empty."))
        } else if (marks < 0) {
            (false, Some("Marks cannot be negative."))
        } else if (marks > totalMarks) {
            (false, Some("Marks cannot exceed total possible marks."))
        } else {
            (true, None)
        }
    }

    def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
        var isValid = false
        var studentInfo: (String, Int, Int, Double, Char) = null
    
        while (!isValid) {
            studentInfo = getStudentInfo()
            val (name, marks, totalMarks, _, _) = studentInfo
            val (valid, errorMessage) = validateInput(name, marks, totalMarks)
        
            if (valid) {
                isValid = true
            } else {
                println(s"Error: ${errorMessage.get}")
            }
        }
        studentInfo
    }
}


