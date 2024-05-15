class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int n = nums.length;
        
        if(n == 1)
            return true;
        
        int flag = 0;
        
        /* 0 -> unknown 
          -1 -> non-increasing, 
           1 -> increasing
        */
        
        for(int i = 1; i < n ;i++){
            
            if(nums[i] < nums[i - 1]){
                
                if(flag == 0) 
                    flag = -1;
                else if(flag == 1)
                    return false;
                
            }
            else if(nums[i] > nums[i - 1]){
                if(flag == 0)
                    flag = 1;
                else if(flag == -1)
                    return false;
            }
            
        }
        
        return true;     
        
    }
}