class Solution {
    public int trap(int[] height) {
        if(height == null){
            return 0;
        }
        
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int result = 0;
        
        while(l < r){
            if(leftMax < rightMax){
                l += 1;
                leftMax = Math.max(leftMax, height[l]);
                result += leftMax - height[l];
            }
            else{
                r -= 1;
                rightMax = Math.max(rightMax, height[r]);
                result += rightMax - height[r];
            }
        }
        
        return result;
    }
}
