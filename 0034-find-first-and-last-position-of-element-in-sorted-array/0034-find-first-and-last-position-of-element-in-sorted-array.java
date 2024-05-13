class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr = new int[2];
        
        arr[0] = getFirstPosition(nums, target);
        arr[1] = getLastPosition(nums, target);
        
        return arr;
        
    }
    
    public int getFirstPosition(int[] nums, int target){
        int i = 0; 
        int j = nums.length - 1;
        
        if(nums.length == 0) return -1;
        
        while(j - i > 1){
            int mid = i + (j - i)/2;
            if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                j = mid;
            }
        }
        
        if(nums[i] == target)
            return i;
        if(nums[j] == target)
            return j;
        return -1;
        
    }
                                
    public int getLastPosition(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;
        
        if(nums.length == 0) return -1;
        
        while(j - i > 1){
            int mid = i + (j - i)/2;
            if(nums[mid] <= target){
                i = mid;
            }
            else{
                j = mid - 1;
            }
        }
        
        if(nums[j] == target)
            return j;
        if(nums[i] == target)
            return i;
        
        return -1;
    }
                                
}