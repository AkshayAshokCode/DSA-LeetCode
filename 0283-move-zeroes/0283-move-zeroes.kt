class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var j = -1
        for(i in 0 until nums.size){
            if(nums[i] == 0){
                j=i
                break
            }
        }
        if(j != -1){
            for(i in j+1 until nums.size){
            if(nums[i]!=0){
                nums[j] = nums[i].also{nums[i] = nums[j]}
                j++
            }
        }
        }
        
      
    }
}