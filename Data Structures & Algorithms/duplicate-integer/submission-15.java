class Solution {
    public boolean hasDuplicate(int[] nums) {
        //create a set 

        //look thorugh the array gathering each number 

        //check if that value is in the set if it is return true;; 

        //then add teh current value into the set 

        Set<Integer> set = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true; 
            }
            set.add(nums[i]); 
        }
        return false; 
    }
}