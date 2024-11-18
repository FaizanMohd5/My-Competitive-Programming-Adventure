class Solution {
    
    public int[] decrypt(int[] code, int k) {
        
        int n = code.length;
        
        int[] result = new int[n];
        
        Arrays.fill(result, 0);
        
        int i = 0; 
        int j = 0;
        
        if(k == 0){
            
            return result;
        
        } else if(k > 0) {
            i = 1;
            j = k;
        } else {
            i = n + k;
            j = n - 1;
        }
        
        int windowSum = 0;
        for(int p = i; p <= j; p++){
            windowSum += code[p];
        }
        
        for(int p = 0; p < n; p++){
            
            result[p] = windowSum;
            
            windowSum -= code[i % n];
            i++;
            
            windowSum += code[(j+1) % n];
            j++;
            
        }
            
        return result;
        
    }
    
    
    
}