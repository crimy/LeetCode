class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        int i = 0;
        int j = 1;
        String answer = s.substring(0,1);
        if(isPalindromic(s,s.length())) {
            return s;
        }
        while (i < size && j <= size) {
            String sub = s.substring(i,j);
            int length = sub.length();
            if(length < answer.length()) {
                j++;
                continue;
            }
            if(isPalindromic(sub,length)) {
                answer = sub;
            }
            if(j < size) {
                j++;
                continue;
            }
            i++;
            j=i+1;
        }
    
        return answer;
    }
    public boolean isPalindromic(String sub, int length) {
        int pointer = (int)Math.ceil(length / 2);
        for(int index =0; index <= pointer; index++) {
            if(sub.charAt(index) != sub.charAt(length-1-index)) {
                return false;
            } 
        }
        return true;
    }
}