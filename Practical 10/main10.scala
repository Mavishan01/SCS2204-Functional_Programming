import Q10_01and02.neg
import Q10_01and02.sub
import Q10_03and04._
import Q10_05.countLetterOccurrences

object Q10_Main{
    def main(args: Array[String]): Unit = {
        // neg();
        // sub();

    // println("Initial Accounts:")
    // ABank.printAccounts()

    // account1.transfer(account3, 500)  // Transfer 500 from account1 to account3
    // ABank.printAccounts()

    // println("\nAccounts with Negative Balances:")
    // ABank.negativeBalanceAccounts.foreach(println)

    // println(s"\nTotal Balance: $$${ABank.totalBalance}")

    // ABank.applyInterest()
    // println("\nAfter Applying Interest:")
    // ABank.printAccounts()

    val words = List("apple", "banana", "cherry", "date")
    println(countLetterOccurrences(words))
    }
}