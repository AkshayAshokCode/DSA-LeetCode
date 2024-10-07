class Solution {
    fun minLength(s: String): Int {
     val stack = mutableListOf<Char>()

    for (char in s) {
        // Check for occurrences of "AB" or "CD"
        if (stack.isNotEmpty() && ((stack.last() == 'A' && char == 'B') || (stack.last() == 'C' && char == 'D'))) {
            // Remove the last character if a matching pair is found
            stack.removeAt(stack.size - 1)
        } else {
            // Otherwise, push the current character onto the stack
            stack.add(char)
        }
    }

    // The remaining string is stored in the stack, so the length of the stack is the answer
    return stack.size
    }
}