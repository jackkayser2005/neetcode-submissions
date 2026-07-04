class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>(); 
    //currently empty! 

        for(int i = 0; i < nums.length; i++) {
            //loop all elements 
            int num = nums[i]; 
            int diff = target - num; //this is the updated target by subtracting at said element 

            if(prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i}; 
            }

            prevMap.put(num, i); 
        }
        return new int[] {}; 
    }
}
