object question02 extends App{

    class Rational(x:Int,y:Int) {

        def numer = x
        def denom = y

        def neg = new Rational(-this.numer,this.denom)

        def +(that:Rational) = new Rational(this.numer*that.denom + this.denom*that.numer, this.denom * that.denom)

        def -(that:Rational) = this + that.neg 

        override def toString(): String = s"${this.numer}/${this.denom}"
    }


    val rational1 = new Rational(3,4)
    val rational2 = new Rational(5,8)
    val rational3 = new Rational(2,7)
    println(s"$rational1 - $rational2 - $rational3 = ${rational1 - rational2 - rational3}")


}