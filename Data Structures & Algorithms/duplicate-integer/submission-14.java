class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++) {
            int sum = nums[i]; 

            if(set.contains(sum)) {
                return true; 
            } 

            set.add(sum); 


        }
        return false; 
    }
}