class Solution {
    fun isValid(s: String): Boolean {
          val stack = mutableListOf<Char>()
    val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        if (char in matchingBrackets.values) {
            stack.add(char)
        } else if (char in matchingBrackets.keys) {
            if (stack.isEmpty() || stack.removeAt(stack.size - 1) != matchingBrackets[char]) {
                return false
            }
        }
    }

    return stack.isEmpty()
    }
}