object q02 {
  def main(args: Array[String]): Unit = {
    val stringList = List("University", "of", "Colombo", "UCSC", "UOC", "UOC.")
    
    def filterLongStrings(strings: List[String]): List[String] = {
      strings.filter(s => s.length > 5)
    }
    
    val filteredList = filterLongStrings(stringList)
    println(filteredList)
  }
}

