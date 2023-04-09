class Solution {
    fun climbStairs(n: Int): Int {
        if(n <= 2) {
            return n
        }
        val steps = IntArray(n+1) { 0 }
        steps[1] = 1
        steps[2] = 2
        for (index in 3..n) {
            steps[index] = steps[index-1] + steps[index-2]
        }
        return steps[n]
    }
}