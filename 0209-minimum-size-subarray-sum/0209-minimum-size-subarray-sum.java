class Solution {
    
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
              
        int i = 0; 
        
        int j = 0;
        
        int minimum = Integer.MAX_VALUE;
        
        int sum = 0;
        
        while(j < n){
            
            sum += nums[j];
            
            while(sum >= target){
                minimum = Math.min(minimum, j - i + 1);
                sum = sum - nums[i];
                i++;
            }
            
            j++;
            
        }
        
        return minimum == Integer.MAX_VALUE ? 0: minimum;
        
    }
    
}