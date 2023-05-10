class Solution {
    public int maximum69Number (int num) {
        char[] array = String.valueOf(num).toCharArray();
        int digit = -1;
        for(int i=0; i<array.length; i++) {
            if(array[i] == '6') {
                digit = i;
                break;
            }
        }
        if(digit == -1) return num;
        array[digit] = '9';
        int answer=0;
        int length = array.length-1;
        for(char number : array) {
            answer += Character.getNumericValue(number) * Math.pow(10,length);
            length--;
        }
        return answer;
    }
}