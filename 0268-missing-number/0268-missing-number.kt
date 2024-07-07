class Solution {
    fun missingNumber(nums: IntArray): Int {
        var ans = nums.size
        // a xor a = 0
        nums.forEachIndexed { ind, num -> ans = ans xor ind xor num}

        return ans
        
    }
}