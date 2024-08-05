import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object lab07_q01 {

    
    //Function for get inputs from user
    def getUserInputs(count: Int): List[Int] = {

        //Initialize a empty ListBuffer to collect user inputs
        val numbers = ListBuffer[Int]()

        //loop for get inputs
        for( i <- 0 until count) {
            println(s"Enter number ${i+1}: ")
            val input = readInt()
            numbers += input //Append the input to the ListBuffer
        }

        // Convert the ListBuffer to an immutable List and return
        numbers.toList
        
    }

    //Function for filter even numbers entered by user
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(n => n%2 ==0)
    }

    //Function for calculate square of numbers entered by user
    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map((n:Int) => n*n)
    }

    //Function for filter prime numbers entered by user
    def filterPrime(numbers: List[Int]): List[Int] = {
        val isPrime: Int => Boolean = n =>{ //isPrime takes Int as input and return a Boolean
            if(n<=1) false //Numbers less than or equal to 1 are not prime
            else !(2 to Math.sqrt(n).toInt).exists(i=>n%i==0)
        }

        numbers.filter(isPrime)
    }

    def main(args: Array[String]): Unit =  {
        println("How many numbers do you want to enter?")
        val count = readInt()

        //Get user inputs as a list
        val userInputs = getUserInputs(count)

        //Filter the even numbers from the list
        val selected_even_numbers = filterEvenNumbers(userInputs)

        //Print even numbers
        println("Even numbers you have entered: ")
        println(selected_even_numbers)

        //Print square of numbers
        println("Square of numbers you have entered: ")
        val square_numbers = calculateSquare(userInputs)
        println(square_numbers)

        //Print prime numbers
        println("Prime numbers you have entered: ")
        val prime_numbers = filterPrime(userInputs)
        println(prime_numbers)

    }

}
