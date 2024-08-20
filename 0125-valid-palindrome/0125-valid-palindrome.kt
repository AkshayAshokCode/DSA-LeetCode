class Solution {
    fun isPalindrome(s: String): Boolean {
        
        val filteredString = s.filter{it.isLetterOrDigit()}.lowercase()
        
       // return filteredString == filteredString.reversed()
        
        var left = 0
        var right = filteredString.length - 1
    
        while (left < right) {
            if (filteredString[left] != filteredString[right]) {
                return false
            }
            left++
            right--
        }
    
    return true
    }
}