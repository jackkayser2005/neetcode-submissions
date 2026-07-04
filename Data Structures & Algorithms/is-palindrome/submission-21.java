class Solution {
    public boolean isPalindrome(String s) {
        int l = 0; 
        int r = s.length() -  1; 

        s = s.toLowerCase(); 
        while(l < r) { 
            
           while(l < r && !Character.isLetterOrDigit(s.charAt(l))) {
            l++; 
           } 
           while(l < r && !Character.isLetterOrDigit(s.charAt(r))) {
            r--; 
           } 


            char first = s.charAt(l); 
            char last = s.charAt(r); 

            if(first != last) {
                return false; 
            }
            l++; 
            r--;


        }
        return true; 
    }
}
