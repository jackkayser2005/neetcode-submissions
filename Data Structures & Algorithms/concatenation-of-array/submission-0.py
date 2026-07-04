class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        newArr = [0] * (2 * len(nums))

        for i in range(len(nums)):
            newArr[i] = nums[i]
            #now next i after
            newArr[i + len(nums)] = nums[i]

        return newArr
        