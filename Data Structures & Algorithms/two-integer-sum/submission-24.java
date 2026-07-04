class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];

            if(map.containsKey(newTarget)) {
                return new int[] {map.get(newTarget), i}; 
            } 
            map.put(nums[i], i);
        }
        return new int[] {}; 
    }
}
