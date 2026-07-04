class Solution {
    public int trap(int[] height) {
        int water = 0; 
        int l = 0; 
        int r = height.length-1; 
        int leftMax = 0; 
        int rightMax = 0; 
        while(l<r) {
            if(height[l] < height[r]) {
                leftMax = Math.max(leftMax, height[l]); //max seen height and update it 
                water += leftMax - height[l]; //remove the dips from the equation 

                l++;
            } else{
                rightMax = Math.max(rightMax, height[r]);
                water += rightMax - height[r]; 
                r--;
            }

        }
        return water; 
    }
}
