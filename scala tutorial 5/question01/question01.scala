object Question01 {

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

    def main(args: Array[String]): Unit = {
        println(s"5 is a prime number => ${prime(5)}")
        println(s"8 is a prime number => ${prime(8)}")
    }
}