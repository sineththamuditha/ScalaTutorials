object Question02 {

    def gcd(x:Int,y:Int):Int = y match {
        case 0 => x
        case y if y>x => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def prime(x:Int,y:Int = 2):Boolean = y match {
        case y if(y==x) => true
        case y if gcd(x,y)>1 => false
        case y => prime(x,y+1)
    }

    def primeSeq(x:Int,y:Int =2):Unit = {
        if(x == y) {return}
        else if(prime(y)) {
            println(y)
        }
        primeSeq(x,y+1) 
    } 

    def main(args: Array[String]): Unit = {
        println(s"Prime numbers under 10 =>")
        primeSeq(10)
    }
}
