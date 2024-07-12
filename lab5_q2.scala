object InventoryManagement {

    //function for display inventory in retail store
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

    //function for restock and item
    def restockItem(itemNames: Array[String], itemQuantity: Array[Int], itemName: String, quantity: Int): Unit = {
        val index = itemNames.indexOf(itemName)
        if(index >= 0){
            itemQuantity(index) = itemQuantity(index) + quantity
            println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantity(index)}")
        }else {
            println(s"Item '$itemName' does not exist in inventory")
        }
    }

    def main(args: Array[String]): Unit = {
        val itemNames = Array("Mangoes", "Banana", "Apples", "Grapes")
        val itemQuantity = Array(9, 5, 6, 15)

        //display initial inventory
        displayInventory(itemNames, itemQuantity)

        //restock items
        restockItem(itemNames, itemQuantity, "Banana", 5)
        restockItem(itemNames, itemQuantity, "Mangoes", 7)

        //display Inventory after restocking

        println("After restocking.. ")
        displayInventory(itemNames, itemQuantity)
    }
}
