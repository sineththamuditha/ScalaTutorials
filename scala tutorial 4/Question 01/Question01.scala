object question01 {

    def interestRate(x:Int):Double = x match {
        case x if(x< 20000) => .02;
        case x if(x < 200000) => .035;
        case x  if(x < 2000000) => .04;
        case _ => .065;
    } 

    def interestPerYear(x:Int):Double = {
        return x * interestRate(x);
    }

    def main(args:Array[String]) = {

        println("Interest per year: " + interestPerYear(15000000));

    }
}