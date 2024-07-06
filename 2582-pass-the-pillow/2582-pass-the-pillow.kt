class Solution {
    fun passThePillow(n: Int, time: Int): Int {
        var position = 1
        var direction = 1
        
        for(i in 0 until time){
            if(position == 1){
                direction = 1
            }else if(position == n){
                direction = -1
            }
            
            position += direction
        }
        return position
    }
}