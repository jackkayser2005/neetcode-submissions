class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length; 
        int best = 0; 
        Stack<Integer> stack = new Stack<>(); 

        for(int i = 0; i <= n; i++) {
            while(!stack.isEmpty() && (i==n || heights[i] <= heights[stack.peek()])) {

                //width * height = area and we want to store the best of those 
                int height = heights[stack.pop()]; 
                int width; 
                if(stack.isEmpty()) {
                    width = i; 
                } else {
                    width = i - stack.peek() - 1; 
                }

            int area = height * width; 
            best = Math.max(best, area);   

                 
               }
                 stack.push(i);  
          
            


           
        }
        return best; 
    }
}
