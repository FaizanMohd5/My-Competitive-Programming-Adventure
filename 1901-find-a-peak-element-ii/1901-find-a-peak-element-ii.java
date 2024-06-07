class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        int row = 0;
        int col = 0;
        
        while(row < m && col < n){
            
            if(col != 0 && mat[row][col] < mat[row][col - 1]){
                col--;
            }
            else if(col != n - 1 && mat[row][col] < mat[row][col + 1]){
                col++;
            }
            else if(row != 0 && mat[row][col] < mat[row - 1][col]){
                row--;
            }
            else if(row != m - 1 && mat[row][col] < mat[row + 1][col]){
                row++;
            }
            else{
                return new int[]{row, col};
            }
            
        }
        
        return new int[]{-1,-1};
        
    }
    
}