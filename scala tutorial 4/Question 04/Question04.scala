object question04 {

    def oddOrEven(x:Int):Unit = {
      if(x%2 == 0){
        println("Even number is given")
      }
      else {
        println("Odd number is given")
      }
    } 
  
    def negativeZero(x:Int):Unit = {
      if(x <= 0) {
        println("Negative/Zero")
      }
    }

    def main(args:Array[String]) = {
      
      for(arg<-args ) {
        var x = arg.toInt
        println(x)
        negativeZero(x)
        oddOrEven(x)
      }
        
    }

}
