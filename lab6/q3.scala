object Q3 extends App {

  // nth fib num?
  def nthFibonacci(n: Int): Int = {
    if (n <= 1) n
    else nthFibonacci(n - 1) + nthFibonacci(n - 2)
  }

  // print fib seq upto nth
  def printFibSeq(n: Int, i: Int = 0): Unit = {
    if (i <= n) {
      print(s"${nthFibonacci(i)} ")
      printFibSeq(n, i + 1)
    }
  }

  printFibSeq(10)
  println()
}
