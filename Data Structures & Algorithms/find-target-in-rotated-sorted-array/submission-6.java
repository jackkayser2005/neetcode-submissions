class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1; 
        


      
        while(l<= r) {
            int m = l + (r-l) / 2; 
            int middleValue = nums[m]; 
            int rightValue = nums[r]; 
            int leftValue = nums[l];
            if(middleValue == target) {
                return m; 
            } else if(leftValue<= middleValue){
                if(target > middleValue || target < leftValue) {
                    l = m + 1; 
                } else {
                    r = m - 1; 
                }
            } else {    
                 if(target < middleValue || target > rightValue) {
                    r=  m - 1;
                } else {
                    l = m + 1; 
                }
            }
        }



    return -1; 
    }
}
