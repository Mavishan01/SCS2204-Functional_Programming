object Q1{
    var (i,j,m,n,k,f,g) = (2,2,5,5,2, 12.0f, 4.0f)
    var C = 'X'

    def run(): Unit = {

    println(k + 12*m)
    println(m/j)
    println(n%j)
    println(m/j*j)
    println(f + 10*5 + g)

    i += 1
    println(i *n)
    }
}

object Q2{        
    var (a,b,c,d) = (2,3,4,5)
    var k = 4.3f
    var g = 4.0f

    def run(): Unit = {
    
    b -= 1
    println(b*a + (c*d-1))

    println(a)
    a += 1

    println(-2* (g-k) + c)

    println(c)
    c += 1

    c += 1
    c = c*a 
    println(c)
    a += 1
    }
}

object Q3{
    var (normalPay, otPay, tax) = (250, 85, 0.12f)

    def takeHomeSalary(normalHours: Int, otHours: Int): Double = {
        (normalPay* normalHours + otPay* otHours)* (1-tax)
    }
}

object Q4{
    val (ticketPrice, people, performCost, attendeeCost) = (15, 120, 500, 3)

    def cost(newTicketPrice: Int): Int = {
        var newPeople = people - (newTicketPrice - ticketPrice)/5*20

        (newTicketPrice* newPeople) - performCost - (attendeeCost* newPeople)
    }
}

