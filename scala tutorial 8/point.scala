object point extends App{

    case class Point(x:Int,y:Int) {
        
        def +(that:Point) = Point(this.x + that.x, this.y + that.y)
        def move(a:Int = 0 , b:Int = 0) = Point(x+a ,y+b)
        def distance(that:Point) = Math.sqrt( Math.pow(this.x-that.x,2) + Math.pow(this.y-that.y,2) )
        def invert() = Point(this.y,this.x) 

        override def toString(): String = s"(${this.x},${this.y})"
    }

    var point1 = Point(2,4)
    var point2 = Point(1,2)

    println(s"$point1 + $point2 = ${point1 + point2}")

    println(s"\nMove $point1 2 units along x and 1 unit along y => ${point1.move(2,1)}")

    println(s"\nDistance between $point1 and $point2 is ${point1.distance(point2)} units")

    println(s"\nInverted $point1 => ${point1.invert()}")
}
