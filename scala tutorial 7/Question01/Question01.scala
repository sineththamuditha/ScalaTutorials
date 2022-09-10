object question01 extends App{

    class Rational(x:Int,y:Int) {
        def numer = x;
        def denom = y;

        def neg = new Rational(-this.numer,this.denom);
         override def toString(): String = s"${this.numer}/${this.denom}"
    }

    val rational = new Rational(4,7)
    println(rational.neg)


}