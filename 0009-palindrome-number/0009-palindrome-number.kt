class Solution {
    fun isPalindrome(x: Int): Boolean {
        var n = x
        var rev = 0
        
        while(n>0){
            var lastDigit = n%10
            n = n/10
            rev = (rev * 10) + lastDigit
        }
        
        return x==rev
        
    }
}