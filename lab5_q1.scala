object InventoryManagement {

    //function to display inventory in retail store
    def displayInventory(itemNames: Array[String], itemQuantity: Array[Int]): Unit = {
        if (itemNames.length != itemQuantity.length){
            println("Error: Item names and quantities array should be same length!")
            return
        }

        println("Inventory:")
        for(i <- itemNames.indices){
            println(s"${itemNames(i)}: ${itemQuantity(i)}")
        }
    }

    def main(args: Array[String]): Unit = {
        val itemNames = Array("Mangoes", "Banana", "Apples", "Grapes")
        val itemQuantity = Array(9, 5, 6, 15)

        //display initial inventory
        displayInventory(itemNames, itemQuantity)
    }
}
