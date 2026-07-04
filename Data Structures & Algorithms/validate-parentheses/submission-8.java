class Solution {
    public boolean isValid(String s) {
        Stack<Character> test = new Stack<>(); 
      
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); 
            if(currentChar == '(' || currentChar == '[' || currentChar == '{') {
                test.push(currentChar); 
                continue; 
            } 
         
            if(test.isEmpty()) return false; 
            if(test.peek() == '(' && currentChar == ')' ||
               test.peek() == '[' && currentChar == ']' || 
               test.peek() == '{' && currentChar == '}') {
                test.pop(); 
            } else {
                return false; 
            }
          


            
        }
        return test.isEmpty(); 
    }
}
