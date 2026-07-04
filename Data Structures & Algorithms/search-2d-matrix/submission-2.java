class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int ROWS = matrix.length; 
         int COLS = matrix[0].length;

         int top = 0; 
         int bottom = ROWS - 1; 

         while(top <= bottom) {
            int row = top + (bottom - top) / 2; 

            if(matrix[row][COLS-1] < target) {
                top = row + 1; 

            } else if(matrix[row][0] > target) {
                bottom = row - 1; 
            }else {
                break; 
            }
         }

         if(!(top <= bottom)) {
            return false; 
         }
        
         int row = (top + bottom) / 2;


         int l = 0; 
         int r = COLS - 1;

         while(l <= r) {
            int m = l + (r-l) / 2; 

            if(matrix[row][m] > target) {
                r = m - 1; 
            } else if (matrix[row][m] < target){
                l = m + 1; 
            } else {
                return true; 
            }
         }
         return false; 

    }
}
