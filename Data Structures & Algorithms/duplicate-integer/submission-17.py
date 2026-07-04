class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #set makes me think here: so maybe here 
        seen = set()

        for i in range(len(nums)):
            seen.add(nums[i])

           
        if len(nums) == len(seen):
                return False
        return True