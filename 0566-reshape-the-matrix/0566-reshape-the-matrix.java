class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        if(n * m != r * c || (n == r && m == c)){
            return mat;
        }
        
        int[][] result = new int[r][c];
        
        for(int i = 0; i < r * c; i++){
            result[i / c][i % c] = mat[i / m][i % m];
        }
        
        return result;
        
    }
}