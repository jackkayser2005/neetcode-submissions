class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        #you want to loop through each taking the first letter
        # 
        
        output = ""

        for i in range(len(strs[0])):
            char = strs[0][i]

            for word in strs: 
                #the word is longer or not equal chars 
                if i >= len(word) or char != word[i]:
                    return output
            
            output+= char
        return output
