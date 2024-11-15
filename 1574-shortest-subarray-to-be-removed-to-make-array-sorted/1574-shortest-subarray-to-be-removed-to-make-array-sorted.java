class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        
        int n = arr.length;
        
        int j = n - 1;     
        while(j > 0 && arr[j] >= arr[j - 1]){
            j--;
        }
        
        int i = 0;
        int result = j;

        while(i < j && (i == 0 || arr[i] >= arr[i - 1])){
            
            while(j < n && arr[i] > arr[j]){
                j++;
            }
            
            result = Math.min(result, j - i - 1);
            i++;
        }
        
        return result;        
        
    }
    
    /*
    
    Initial thought while understanding question: 
    1. Maybe rotated array type logic, 
    2. Let's see increase and decrease graph of this
    3. Binary search can be applied
    4. Peak element in binary
    5. lower and upper bound
    6. SLIDING WINDOW!
    
    */
    
}