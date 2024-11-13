class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        
        int n = nums.length;
        
        long count = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < n; i++){
            
            int key = lower - nums[i];
            
            int idx = lowerBound(nums, i + 1, n - 1, key);
            
            int lessThanLowerCount = idx - 1 - i;
            
            key = upper - nums[i];
            
            idx = upperBound(nums, i + 1, n - 1, key);
            
            int greaterThanUpperCount = idx - 1 - i;
            
            count += greaterThanUpperCount - lessThanLowerCount;
            
        }
        
        return count;
        
    }
    
    public int lowerBound(int[] nums, int start, int end, int key){
        
        int i = start;
        
        int j = end;
        
        int idx = end + 1;
        
        while(i <= j){
            
            int mid = i + (j - i)/2;
            
            if(nums[mid] < key){
                i = mid + 1;
            }
            else{
                idx = mid;
                j = mid - 1;
            }
            
        }
        
        return idx;
        
    }
    
    public int upperBound(int[] nums, int start, int end, int key){
        
        int i = start;
        
        int j = end;
        
        int idx = end + 1;
        
        while(i <= j){
            
            int mid = i + (j - i)/2;
            
            if(nums[mid] <= key){
                i = mid + 1;
            }
            else{
                idx = mid;
                j = mid - 1;
            }
            
        }
        
        return idx;
        
    }
    
}