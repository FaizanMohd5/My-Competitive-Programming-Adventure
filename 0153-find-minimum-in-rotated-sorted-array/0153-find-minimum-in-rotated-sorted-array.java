class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        int ans = Integer.MAX_VALUE;
        
        while(i <= j){
            int mid = i + (j - i)/2;
            
            if(nums[i] <= nums[mid]){
                ans = Math.min(nums[i], ans);
                i = mid + 1;
            }
            else if(nums[mid] <= nums[j]){
                ans = Math.min(nums[mid], ans);
                j = mid - 1;
            }
            
        }
        
        return ans;
        
    }
}