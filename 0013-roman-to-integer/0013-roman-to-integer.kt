class Solution {
    fun romanToInt(s: String): Int {
        
        val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    
    var result = 0
    var i = 0

    while (i < s.length) {
        val current = romanMap[s[i]] ?: 0
        val next = if (i + 1 < s.length) romanMap[s[i + 1]] ?: 0 else 0

        // If the current value is less than the next value, it is a subtractive case
        if (current < next) {
            result += (next - current)
            i += 2 // Skip the next character
        } else {
            result += current
            i++
        }
    }

    return result
    }
}