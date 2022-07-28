object question05 {

    def runningTime(x:Double,y:Double):Double = {
        return x*y
    }

    def main(args: Array[String]): Unit = {
        println("Total running time " + (runningTime(2,8)+runningTime(3,7)+runningTime(2,8)) + " minutes") 
    }
}