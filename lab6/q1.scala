import scala.io.StdIn.readLine

object Q1 extends App {
  def getProductList(i: Int = 0): List[String] = {
    print(s"Enter Item ${i + 1}: ");
    val input = readLine().toLowerCase();
    if (input == "done" || input == "Done") List();
    else List(input) ::: getProductList(i + 1);
  }

  def printProductList(items: List[String], i: Int = 0): Unit = i match {
    case x if (x < items.length) => {
      printf(s"${i + 1}. %s\n", items(i));
      printProductList(items, i + 1);
    }
    case _ => {}
  }

  def getTotalProducts(items: List[String]) = items.length;

  val items = getProductList();
  printProductList(items);
  val total = getTotalProducts(items);
  println(s"Total products: ${total}");
}
