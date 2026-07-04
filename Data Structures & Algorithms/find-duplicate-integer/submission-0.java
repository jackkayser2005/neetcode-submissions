class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); //create a set 

        for(int i = 0; i < nums.length; i++) {
            if(!set.isEmpty() && set.contains(nums[i])) {
                 return nums[i]; 
            }
            set.add(nums[i]); 
        }
        return -1; 
    }
}
