class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        int n = nums.length;
        
        int[] finalState = new int[n];
        
        for(int i = 0; i < n; i++){
            finalState[i] = nums[i];
        }
        
        while(k > 0){
            
            int minimumIndex = getMin(finalState);
            
            int value = finalState[minimumIndex];
            
            finalState[minimumIndex] = value * multiplier;
            
            k--;
        }
        
        return finalState;
    }
    
    private int getMin(int[] arr){
        
        int min = 0;
        
        for(int i = 1; i < arr.length; i++){
            
            if(arr[min] > arr[i]){
                min = i;
            }
            
        }
        
        return min;
    }
    
}