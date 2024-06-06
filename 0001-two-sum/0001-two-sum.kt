class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val numToIndex = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val complement = target - nums[i]
        
        if (numToIndex.containsKey(complement)) {
            return intArrayOf(numToIndex[complement]!!, i)
        }
        
        numToIndex[nums[i]] = i
    }

    // If no solution is found, though the problem guarantees one.
    throw IllegalArgumentException("No two sum solution")
    
        // var result: IntArray = intArrayOf()

        // for(i in nums.indices){
        //     // for(j in nums.indices){
        //     //     if(j>i){
        //     //         if(nums[i] + nums[j] == target){
        //     //              result = result + i
        //     //              result = result + j
        //     //              return result       
        //     //         }
        //     //     }
               
        //     // }
        // }
        // return result
    }
}