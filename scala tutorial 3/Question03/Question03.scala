object question03 {

    def sphereVolume(r:Double):Double = {
        return 4/3 * Math.PI * Math.pow(r,3)
    }

    def main(args: Array[String]): Unit = {
        
        println("Volume of sphere with radius 5 is " + sphereVolume(5))
    }
}