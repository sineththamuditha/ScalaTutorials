object Question05 {

    def isEven(x:Int):Boolean = x match {
        case 0 => true
        case _ => isOdd(x-1)
    }

    def isOdd(x:Int):Boolean = !(isEven(x))

    def sumEven(x:Int):Int = x match {
        case 0 => 0
        case x if isEven(x) => x + sumEven(x-1)
        case _ => 0 + sumEven(x-1)
    }

    def main(args: Array[String]): Unit = {
        println(s"Sum of even numbers upto 7 => ${sumEven(20)}")
    }
}



