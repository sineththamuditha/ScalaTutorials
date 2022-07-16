object question01 {

    def diskArea(r:Double):Double = {
        return Math.PI * Math.pow(r,2)
    }


    def main(args: Array[String]): Unit = {
        

        println("Area of a disk with radius 5 is " + diskArea(5))
    }
}