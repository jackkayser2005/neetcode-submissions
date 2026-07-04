class Solution {
    public boolean isPalindrome(String s) {
        //two pointer algorithm 

        int l = 0; 
        int r = s.length() - 1; 
        s = s.toLowerCase();  //so we do not have to worry about caps 
        while (l < r) { 
            char firstCharL = s.charAt(l); //get first 
            char lastCharR = s.charAt(r); //get last 

            boolean isAlphaL = Character.isLetterOrDigit(firstCharL); //if alpha 
            boolean isAlphaR = Character.isLetterOrDigit(lastCharR); //if alpha 

            if(!isAlphaL) { //if it is not alphanumeric on the left inremenet that and set new firstChar to that length
                l++; 
                firstCharL = s.charAt(l); 
                continue; 
            }
            if(!isAlphaR) { //if it is not alphnumeric on the right decrement that set last char to this 
                r--; 
                lastCharR = s.charAt(r); 
                continue; 
            }
            if(firstCharL != lastCharR) {
                return false; 
            }
            l++; 
            r--; 
            

        }
        return true; 

        
    }
}

