object ceasarCipher extends App{

    //for strings without spaces and contains characters from only given alphabet

    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encode = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.size)

    val decode = (c:Char, key:Int, a:String) => if(a.indexOf(c.toUpper) >= key)  a((a.indexOf(c.toUpper) - key) % a.size) else a(a.size  - ((a.indexOf(c.toUpper) - key).abs))

    def cipher = (action:(Char,Int,String) => Char, str:String, key:Int, alphabet:String) => str.map(action(_,key,alphabet))

    

    println(cipher(encode,"HelloWorld",5,alphabet))
    println(cipher(decode,cipher(encode,"HelloWorld",5,alphabet),5,alphabet))  
}