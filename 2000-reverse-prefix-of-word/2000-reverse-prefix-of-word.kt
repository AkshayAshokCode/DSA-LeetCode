class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        val index = word.indexOf(ch)
        
        if(index == -1){
            return word
        }
        val prefReversed = word.substring(0,index+1).reversed()
        
        return prefReversed + word.substring(index + 1)
    }
}