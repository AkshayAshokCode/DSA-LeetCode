class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for(j in 1 until nums.size){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j]
                i++
            }
        }
        return i+1
    }
}