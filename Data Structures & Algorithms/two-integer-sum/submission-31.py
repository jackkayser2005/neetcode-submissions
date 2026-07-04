class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #not exactly sorted
        #guarenteed to be something here 

        seen = {}

        for i, num in enumerate(nums): 
            compliment = target - num

            if compliment in seen: 
                return [seen[compliment] ,i]

            
            seen[num] = i

        