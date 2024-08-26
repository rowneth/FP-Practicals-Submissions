import scala.collection.mutable.StringBuilder


object lab08_q01{

    def encrypt(text: String, key: Int): String = {
        var result = new StringBuilder //to construct result string

            for (i <- 0 until text.length) {
            	if (text(i) == ' ') {
                    result += ' ' 
                } else if (text(i).isDigit) {
                    // Encrypt digits: '0' to '9'
                    result += ((text(i) - '0' + key) % 10 + '0').toChar
                } else if (text(i).isUpper) {
                    // Encrypt Uppercase letters
                    result += ((text(i) + key - 65) % 26 + 65).toChar
                } else {
                    // Encrypt Lowercase letters
                    result += ((text(i) + key - 97) % 26 + 97).toChar
                }
        }

        result.toString()
    }

    def decrypt(text: String, key: Int): String = {
        var result = new StringBuilder
        //Decrypt Uppercase letters
        for (i <- 0 until text.length) {
            if (text(i) == ' ') {
                result += ' ' 
            } else if (text(i).isDigit) {
                // Decrypt digits: '0' to '9'
                result += ((text(i) - '0' - key + 10) % 10 + '0').toChar
            } else if (text(i).isUpper) {
                // Decrypt Uppercase letters
                result += ((text(i) - key - 65 + 26) % 26 + 65).toChar
            } else {
                // Decrypt Lowercase letters
                result += ((text(i) - key - 97 + 26) % 26 + 97).toChar
            }
    }

        result.toString()
    }

    // Higher-order Cipher function
    def cipher(text: String, key: Int, operation: (String, Int) => String): String = {
        operation(text, key)
    }

    def main(args: Array[String]):Unit = {
        
        val text = "Imalsha Jathunarachchi22"
        val shift = 3

        // Encrypt the text using the Cipher function
        val encryptedText = cipher(text, shift, lab08_q01.encrypt)
        println(s"Encrypted Text: $encryptedText")

        // Decrypt the text using the Cipher function
        val decryptedText = cipher(encryptedText, shift, lab08_q01.decrypt)
        println(s"Decrypted Text: $decryptedText")

    }

}
