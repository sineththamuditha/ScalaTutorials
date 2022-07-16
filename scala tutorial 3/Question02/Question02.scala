object question02 {

    def celsiusToFahrenheit(c:Double):Double = {
        return c*1.8 + 32
    }

    def main(args: Array[String]): Unit = {
        
        println("35 C = " + celsiusToFahrenheit(35) + "F")
    }
}