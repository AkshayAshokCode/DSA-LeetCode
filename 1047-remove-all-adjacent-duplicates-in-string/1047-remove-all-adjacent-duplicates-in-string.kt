class Solution {
    fun removeDuplicates(s: String): String {
        val stack = mutableListOf<Char>()
        
        for(ch in s){
             if (stack.isNotEmpty() && stack.last() == ch) {
                stack.removeAt(stack.size - 1)
            } else {
                stack.add(ch)
            }
        }
        
         return stack.joinToString("")
    }
}