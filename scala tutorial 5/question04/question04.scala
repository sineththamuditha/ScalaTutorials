object Question04 {

    def isEven(x:Int):Boolean = x match {
        case 0 => true
        case _ => isOdd(x-1)
    }

    def isOdd(x:Int):Boolean = !(isEven(x))

    def main(args: Array[String]): Unit = {
        println(s"5 is even => ${isEven(5)}")
        println(s"8 is even => ${isEven(8)}")
    }
}


