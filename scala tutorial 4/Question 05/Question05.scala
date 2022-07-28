
object question04 {

    def toUpper(str:String):String = str.toUpperCase()

    def toLower(str:String):String = str.toLowerCase()

    def first2Upper(str:String): String = s"${toUpper(str.substring(0,2))}${toLower(str.substring(2))}"

    def firstAndLastUpper(str:String): String = s"${toUpper(str.substring(0,1))}${toLower(str.substring(1,str.length()-1))}${toUpper(str.substring(str.length()-1))}"

    def formatNames(name:String, formatFunction: String => String):String = {
        return formatFunction(name)
    }
     

    def main(args:Array[String]) = {
      
      println(formatNames("Benny",toUpper))
      println(formatNames("Niroshan",first2Upper))
      println(formatNames("Saman",toLower))
      println(formatNames("Kumara",firstAndLastUpper))
        
    }

}
