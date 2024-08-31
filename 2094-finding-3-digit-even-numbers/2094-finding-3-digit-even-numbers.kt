class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray {
         val uniqueNumbers = mutableSetOf<Int>()
    
        for(i in digits.indices){
            for(j in digits.indices){
                for(k in digits.indices){
                    if(i != j && i != k && j != k){
                        val firstDigit = digits[i]
                        val secondDigit = digits[j]
                        val thirdDigit = digits[k]
                        
                        if(firstDigit!=0 && thirdDigit%2==0){
                            val number = firstDigit*100 + secondDigit*10 + thirdDigit
                            uniqueNumbers.add(number)
                        }
                        
                    }
                }
            }
        }
         return uniqueNumbers.sorted().toIntArray()
    }
}