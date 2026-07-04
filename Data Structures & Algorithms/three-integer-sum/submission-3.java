class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //srot the array; 
        List<List<Integer>> res = new ArrayList<>(); 

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break; 
            if(i > 0 && nums[i] == nums[i-1]) continue; 

            int l = i+1; 
            int r = nums.length -1; 

            while(l < r) {

                int firstNum = nums[i];
                int secondNum = nums[l]; 
                int thirdNum = nums[r]; 

                int sum = firstNum + secondNum + thirdNum; 

                if(sum < 0) {
                    l++; 
                } else if(sum > 0) {
                    r--; 
                } else {
                    res.add(Arrays.asList(firstNum, secondNum, thirdNum)); 
                    l++; 
                    r--; 
 
                    while(l < r && nums[l] == nums[l-1]) {
                        l++; 
                    }
                }
              




            }

            
        }
        return res; 
    }
}
