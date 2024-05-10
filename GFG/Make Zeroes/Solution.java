class Solution
{
    public void  MakeZeros(int[][] matrix)
    {
        int[][] initial = new int[matrix.length][matrix[0].length];
    
        // Copy the original matrix to the initial matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                initial[i][j] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < initial.length; i++){
            for(int j = 0; j < initial[0].length; j++){
                if(initial[i][j] == 0){
                    int sum = 0;
                    //upper
                    if(i - 1 > -1){
                        sum += initial[i - 1][j];
                        matrix[i - 1][j] = 0;
                    }
                    //lower
                    if(i + 1 < initial.length){
                        sum += initial[i + 1][j];
                        matrix[i + 1][j] = 0;
                    }
                    //left
                    if(j - 1 > -1){
                        sum += initial[i][j - 1];
                        matrix[i][j - 1] = 0;
                    }
                    //right
                    if(j + 1 < initial[0].length){
                        sum += initial[i][j + 1];
                        matrix[i][j + 1] = 0;
                    }
                    matrix[i][j] = sum;   
                }
            }
        }
        
    }
}
