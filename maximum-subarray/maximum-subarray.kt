class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if(nums.size == 1) {
            return nums[0]
        }
        val result = IntArray(nums.size) {0}
        result[0] = nums[0]
        for(index in 1 until result.size) {
            result[index] = (result[index - 1] + nums[index]).coerceAtLeast(nums[index])
        }
        return result.max() ?: 0
    }
}