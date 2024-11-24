class Solution {
    public long maxMatrixSum(int[][] matrix) {
        
        int n = matrix.length; 
        
        int negativeCount = 0;
        
        long sum = 0;
        
        int minAbsValue = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n; j++){
                
                sum += Math.abs(matrix[i][j]);
                
                if(matrix[i][j] < 0){
                    negativeCount++;
                }
                
                minAbsValue = Math.min(minAbsValue, Math.abs(matrix[i][j]));
                
            }
            
        }
        
        
        if(negativeCount % 2 == 0){
            
            return sum;
        
        }
        
        return sum - 2*minAbsValue;
    }
    
}