class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int length = queries.length;
        int[] answer = new int[length];
        int result = 0;
        for(int num : nums) {
            result += calculate(num);
        }
        for(int index=0; index<length; index++) {
            int targetIndex = queries[index][1];
            int value = queries[index][0];
            result -= calculate(nums[targetIndex]);
            nums[targetIndex] +=value;
            result += calculate(nums[targetIndex]);
            answer[index] = result;
        }
        return answer;
    }
    public int calculate(int num) {
        if(num%2 == 0) return num;
        else return 0;
    }
}