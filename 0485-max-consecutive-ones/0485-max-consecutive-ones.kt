class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
     var counter = 0
        var max = 0
        for(i in 0 until nums.size){
            if(nums[i]==1){
                counter++
                if(max < counter){
                    max = counter
                }
            }else{
                counter = 0
            }
        }
        return max
    }
}