class Solution {
    public int maxArea(int[] height) {
        int from = 0;
        int to = height.length-1;
        int water = calculate(0,to,height);
        while(from < to) {
            water = Math.max(water,calculate(from,to,height));
            if(height[from] > height[to]) {
                to--;
            } else from++;
        }
        return water;
    }
    public int calculate(int from, int to, int[] height) {
        return (to-from) * Math.min(height[from],height[to]);
    }                            
}