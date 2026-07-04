class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #so we have S and we have T
        # if s and t contain the same number of letters 
        # IE same frequency map of all numbers 
        # it will be an anagram: so clearly a dict is in use here
        # to make a frequency map of each then compare them directly
        freqS = defaultdict(int)
        freqT = defaultdict(int)
        for item in s: 
            freqS[item] += 1

        for item in t:
            freqT[item] += 1

        if freqS == freqT:
            return True
        return False