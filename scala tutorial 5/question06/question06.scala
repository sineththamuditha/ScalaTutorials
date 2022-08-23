object Question06 {

    def fibonnacci(x:Int):Int = x match {
        case 0 => 0
        case x if x==1 =>1
        case _ => fibonnacci(x-1) + fibonnacci(x-2)
    }

    def fibonnacciSeq(x:Int):Any = {
        if(x>0) {fibonnacciSeq(x-1)}
        println(fibonnacci(x))
    }

    def main(args: Array[String]): Unit = {
        println(s"First 10 fibonnacci numbers => ")
        fibonnacciSeq(10)
    }
}



