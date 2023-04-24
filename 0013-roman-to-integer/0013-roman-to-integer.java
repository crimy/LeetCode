class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        
        int answer = 0;
        for(int index=0; index < s.length(); index ++) {
            int value = romanMap.get(s.charAt(index));
            if(index != s.length() -1 && value < romanMap.get(s.charAt(index+1))) {
                answer -= value;
            } else answer += value;
        }
        return answer;
    }
}