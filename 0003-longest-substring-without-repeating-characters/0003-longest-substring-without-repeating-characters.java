class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int answer = 0;
        while (i < size && j < size) {
            set.add(s.charAt(j));
            if (set.size() == (j - i +1)) {
                answer = Math.max(j - i + 1, answer);
                j++;
            } else {
                i++;
                j = i;
                set.clear();
            }
        }
        return answer;
    }
}
