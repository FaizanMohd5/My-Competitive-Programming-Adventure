class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high){
            int mid = low + (high - low)/2;
            
            if(nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            
            if(mid % 2 != 0){
                if(nums[mid - 1] == nums[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
                
            }
            else{
                if(nums[mid] == nums[mid + 1])
                    low = mid + 2;
                else
                    high = mid - 2;
            }
            
        }
        
        return nums[low];
        
    }
}
