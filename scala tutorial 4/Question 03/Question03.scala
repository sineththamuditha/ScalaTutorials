object question03 {

    case class Car(name:String, price:Double, uuid:String) 
    
    object Car {
        def apply(name:String,price:Double):Car = {
            Car(name, price, s"${name} -   ${name.hashCode()}");
        }
    } 

    def printArray(A:Array[Car]):Unit = {
        if(A.length != 0) {
        println(s"car uuid =  ${A.head.uuid}");
        printArray(A.tail)
        } 
    }


    def main(args:Array[String]) = {

        var carArray : Array[Car] = Array( Car("bmw 3 series",20000),Car("bmw 5 series", 50000),Car("vw passat", 10000),Car("vw golf", 12000),Car("mazda 3", 15000));

        printArray(carArray);
    }

}
