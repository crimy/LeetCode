class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int length = queries.length;
        int[] answer = new int[length];
        for(int index=0; index<length; index++) {
            int targetIndex = queries[index][1];
            int value = queries[index][0];
            nums[targetIndex] +=value;
            for(int newNum : nums) {
                answer[index] += calculate(newNum);
            }
        }
        return answer;
    }
    public int calculate(int num) {
        if(num%2 == 0) return num;
        else return 0;
    }
}