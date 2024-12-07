class Solution {
    
    //FFFFFFFTTTTTTTTT pattern
    //       ^
    //     answer
    
    private boolean predicate(int[] nums, int key, int maxOperations){
        
        int totalOperations = 0;
        
        for(int num: nums){
            
            int operations = num / key;
            
            if(num % key == 0)
                operations--;
            
            totalOperations += operations;
            
        }
        
        return totalOperations <= maxOperations;
        
    }
    
    public int minimumSize(int[] nums, int maxOperations) {
        
        int left = 1;
        
        int right = getMax(nums);
        
        //n.log(max)
        while(left < right){
            
            int mid = left + (right - left) / 2;
            
            if(predicate(nums, mid, maxOperations)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
            
        }
        
        return left;
        
    }
    
    private int getMax(int[] arr){
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            
            max = Math.max(max, arr[i]);
            
        }
        
        return max;
    }
    
}