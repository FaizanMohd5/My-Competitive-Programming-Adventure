class Solution {
    
    public int maxEqualRowsAfterFlips(int[][] matrix) {
    
        int m = matrix.length;
        int n = matrix[0].length;
        
        int maxRows = 0;
        
        for(int[] currentRow: matrix){
            
            int[] inverted = new int[n];
            
            for(int i = 0; i < n; i++){
                
                inverted[i] = currentRow[i] == 0? 1 : 0;
                
            }
            
            int count = 0;
            
            for(int[] row: matrix){
                
                if(Arrays.equals(row, currentRow) || Arrays.equals(row, inverted)){
                    
                    count++;
                    
                }
                
            }
            
            maxRows = Math.max(count, maxRows);
            
        }
        
        return maxRows;
    }
    
}