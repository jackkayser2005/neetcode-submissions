class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0; 
        }
          Arrays.sort(nums); 
        int inc = 1; 
        int best = 1;
        for(int i = 1; i < nums.length; i++) {
            

            int difference = nums[i] - nums[i-1]; 
            if(difference == 1) {
                inc++; 
            }
            else if(difference == 0) {
                continue; 
            } else if(difference > 0) {
               
                inc = 1; 
            }
            best = Math.max(best, inc);  
        }
        return best; 

    }
}
