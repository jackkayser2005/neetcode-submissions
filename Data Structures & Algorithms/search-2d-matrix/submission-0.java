class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length; 
        int COLS = matrix[0].length; 

        int top = 0; 
        int bottom = ROWS -1; 

        while(top <= bottom) {
            int row = top + (bottom - top) / 2;  

            if(target < matrix[row][0]) {
                bottom = row - 1;
            } else if(target > matrix[row][COLS-1]) {
                top = row + 1; 
            } else {
                break; 
            }


        }
        if(!(top<= bottom)) {
            return false; 
        }
        int row = (top + bottom) / 2; //that is the row we are int 

        int l = 0; 
        int r = COLS - 1;

        while(l<=r) {
            int mid = l + (r-l) / 2;

            if(matrix[row][mid] < target) {
                l = mid + 1;
            } else if(matrix[row][mid] > target) {
                r = mid - 1;  
            } else {
                return true; 
            }


        }

        return false; 
    }
}
