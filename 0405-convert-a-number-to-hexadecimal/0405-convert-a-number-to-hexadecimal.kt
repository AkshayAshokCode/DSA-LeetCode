class Solution {
    fun toHex(num: Int): String {
        
        if (num == 0) return "0"
    
        val hexChars = "0123456789abcdef"
        var n = if (num < 0) num.toLong() and 0xFFFFFFFF else num.toLong()
        val result = StringBuilder()
        
        while(n > 0){
            val remainder = (n % 16).toInt()
             result.append(hexChars[remainder])
            n /= 16
        }
        
        return result.reverse().toString()
    }
}