object Question03 {

    def sum(x:Int):Int = x match {
        case 0 => 0
        case _ => x + sum(x-1)
    }

    def main(args: Array[String]): Unit = {
        println(s"Sum from 1 to 5 => ${sum(5)}")
    }
}

