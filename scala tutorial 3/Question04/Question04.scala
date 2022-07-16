object question04 {

    def bookPrice(x:Int):Double = {
        return 24.95 * x
    }

    def discount(x:Double):Double = {
        return x * 40 /100
    }

    def finalBookPrice(x:Int):Double = {
        return bookPrice(x) - discount(bookPrice(x))
    }

    def shippingFirst50(x:Int):Double = {
        return x*3
    }

    def shippingRest(x:Int):Double = {
        return x*.75
    }

    def shippingCost(x:Int):Double = {
        return if(x <= 50) shippingFirst50(x) else shippingFirst50(50) + shippingRest(x-50)
    }

    def finalCost(x:Int):Double = {
        return finalBookPrice(x) + shippingCost(x)
    }
    
    def main(args: Array[String]): Unit = {
        
        println("Total price of 60 books Rs." + finalCost(60))
    }
}