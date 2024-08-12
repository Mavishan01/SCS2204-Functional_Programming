object Q8_01{
    def encryption(text: String, jumps: Int): String = {
        val lambda : Char => Char = x => {
            if (x.isLetter){
                if (x.isUpper){
                    ((x.toInt -65 + jumps) %26 +65 ).toChar
                }
                else {
                    ((x.toInt -97 + jumps) %26 +97 ).toChar
                }
            }
            else{
                x
            }
        }

        val encrypted = text.map(lambda)
        encrypted
    }

    def decryption(text: String, jumps: Int): String = {
        val lambda : Char => Char = x => {
            if (x.isLetter){
                if (x.isUpper){
                    ((x.toInt -65 + (26-jumps)) %26 +65 ).toChar
                }
                else {
                    ((x.toInt -97 + (26-jumps)) %26 +97 ).toChar
                }
            }
            else{
                x
            }
        }

        val decrypted = text.map(lambda)
        decrypted
    }

    def cipher(text: String, jumps: Int, encryption: (String,Int) => String, decryption: (String,Int) => String): (String, String) = {
        val encryptedText = encryption(text, jumps)
        val decryptedText = decryption(text, jumps)
        (encryptedText, decryptedText)
    } 
}

object Q8_02{
    def patternMatch(): Unit = {

    println("Enter the Integer:")
    val number = scala.io.StdIn.readInt()

    val message : Int => String = x => {
        if (x%3 == 0) {
            if (x%5 == 0) {
                "Multiple of Both Three and Five"
            }
            else {
                "Multiple of Three"
            }
        }
        else if (x%5 == 0) {
            "Multiple of Five"
        }
        else {
            "Not a Multiple of Three or Five"
        }
    }
    println(message(number))
    }
}