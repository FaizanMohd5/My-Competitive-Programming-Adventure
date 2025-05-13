class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = n - 1;

        int number = 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            
            // traverse left to right
            for(int i = colStart; i <= colEnd; i++){
                matrix[rowStart][i] = number++;
            }
            rowStart++;

            // traverse up to down
            for(int i = rowStart; i <= rowEnd; i++){
                matrix[i][colEnd] = number++;
            }
            colEnd--;

            // traverse right to left
            for(int i = colEnd; i >= colStart; i--){
                matrix[rowEnd][i] = number++;
            }
            rowEnd--;

            // traverse down to up
            for(int i = rowEnd; i>= rowStart; i--){
                matrix[i][colStart] = number++;
            }
            colStart++;

        }
        return matrix;
    }
}