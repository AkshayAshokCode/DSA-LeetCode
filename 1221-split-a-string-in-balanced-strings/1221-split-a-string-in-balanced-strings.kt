class Solution {
    fun balancedStringSplit(s: String): Int {
         var balance = 0
         var count = 0
        
        for(ch in s){
            if(ch == 'L'){
                balance++
            }else if(ch == 'R'){
                balance--
            }
            
            if(balance == 0){
                count++
            }
            
        }
        return count
    }
}