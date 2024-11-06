class Solution {
    
    public boolean canSortArray(int[] nums) {
        
        int n = nums.length;
        
        for(int i = 0; i < n - 1; i++){
            boolean isSorted = true;
            for(int j = 0; j < n - i - 1; j++){
                
                if(nums[j] > nums[j + 1]){
                    isSorted = false;
                    if(Integer.bitCount(nums[j]) == Integer.bitCount(nums[j + 1])){
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                    else{
                        return false;
                    }                    
                }
                
            }
            if(isSorted) break;
            
        }
        
        return true;
        
    }
    
}