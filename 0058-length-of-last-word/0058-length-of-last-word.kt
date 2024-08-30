class Solution {
    fun lengthOfLastWord(s: String): Int {
        val trimmedString = s.trim()
        val words = trimmedString.split(" ")
       if(words.isNotEmpty()){
           return words.last().length
       }
        return 0
    }
}