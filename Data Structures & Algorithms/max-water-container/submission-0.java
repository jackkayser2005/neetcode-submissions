class Solution {
    public int maxArea(int[] heights) {
        //two pointer approach 
        int res = 0; 
        int l = 0; 
        int r = heights.length -1; 
        int area = 1; 
        while(l < r) {
            
            int width = r - l; //this will find the width 
            //so we have two heights left and right we have to determine the lower one and multiply area of that 
            if(heights[l] > heights[r]) {
                area = heights[r] * width; 
            } else {
                area = heights[l] * width; 
            }
            if(heights[l] > heights[r]) {
                r--; 
            } else {
                l++; 
            }
            if(res < area) {
                res = area; 
            }
        }
        return res; 
    }
}
