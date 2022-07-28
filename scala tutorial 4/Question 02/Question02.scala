object question02 {

    case class shoppingCartItem(name:String, price:Double, quantity:Int)

    def printArray(A:Array[shoppingCartItem]):Unit = {
        if(A.length != 0) {
        println(s"${A.head.quantity} ${A.head.name} at Rs ${A.head.price} each")
        printArray(A.tail)
        } 
    }

    def findVanillaIceCream(A:Array[shoppingCartItem]):Unit = {
        if(A.length != 0) {
            if(A.head.name.contains("vanilla ice cream")) {
                println(s"${A.head.quantity} ${A.head.name}")
            }
            else {
                println("Found another item");
            }
            findVanillaIceCream(A.tail)
        }
    }

    def main(args:Array[String]) = {

        var shoppingCart : Array[shoppingCartItem] = Array( shoppingCartItem("vanilla ice cream",3.99,13),shoppingCartItem("chocolate biscuits",4,6),shoppingCartItem("cupcakes",7.77,7));
        printArray(shoppingCart);
        println("\nFinding Vanilla ice cream -> ")
        findVanillaIceCream(shoppingCart);
    }

}