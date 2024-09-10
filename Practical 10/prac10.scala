object Q10_01and02{
    class rational(x:Int, y:Int){
    def numer = x
    def denom = y

    def neg() = new rational(-numer , denom)

    def sub(r:rational) = new rational(numer*r.denom - r.numer*denom, denom*r.denom)

    override def toString(): String = numer + "/" + denom
    }

    val r = new rational(4,5)

    def neg(): Unit = {
        println(r.neg().toString())
    }    

    val rational1 = new rational(3,4)
    val rational2 = new rational(5,8)
    val rational3 = new rational(2,7)

    def sub(): Unit = {
        println(rational1.sub(rational2).sub(rational3 ).toString())
    }
}

object Q10_03and04{

    class Account(val id: Int, var balance: Double) {
  
    def deposit(amount: Double): Unit = {
        if (amount > 0) balance += amount
        else println("Deposit amount must be positive")
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0 && balance >= amount) balance -= amount
        else println("Insufficient balance or invalid amount")
    }

    def transfer(to: Account, amount: Double): Unit = {
        if (amount > 0 && balance >= amount) {
        this.withdraw(amount)
        to.deposit(amount)
        } else {
        println("Transfer failed due to insufficient balance or invalid amount")
        }
    }

    override def toString: String = s"Account($id, Balance: $balance)"
    }

    object ABank {
        var accounts: List[Account] = List()

        def addAccount(account: Account): Unit = {
            accounts = account :: accounts
        }

        def negativeBalanceAccounts: List[Account] = {
            accounts.filter(_.balance < 0)
        }

        def totalBalance: Double = {
            accounts.map(_.balance).sum
        }

        def applyInterest(): Unit = {
            accounts.foreach { account =>
            if (account.balance > 0) {
                account.deposit(account.balance * 0.05)  
            } else {
                account.withdraw(account.balance.abs * 0.1)
            }
            }
        }

        def printAccounts(): Unit = {
            accounts.foreach(println)
        }
    }
    
    val account1 = new Account(1, 1000)
    val account2 = new Account(2, -500)
    val account3 = new Account(3, 200)

    ABank.addAccount(account1)
    ABank.addAccount(account2)
    ABank.addAccount(account3)

    println("Initial Accounts:")
    ABank.printAccounts()

    println("\nAfter Transfer:")
    ABank.printAccounts()

    println("\nAccounts with Negative Balances:")
    ABank.negativeBalanceAccounts.foreach(println)

    println(s"\nTotal Balance: $$${ABank.totalBalance}")

    ABank.applyInterest()
    println("\nAfter Applying Interest:")
    ABank.printAccounts()
}

object Q10_05{
    def countLetterOccurrences(words: List[String]): Int = {
        val wordLengths = words.map(_.length)
        val totalLetters = wordLengths.reduce(_ + _)

        totalLetters
    }
    
}
