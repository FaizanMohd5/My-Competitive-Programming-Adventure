class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int n = nums.length;
        
        long windowSum = 0;
        
        long max = 0;
        
        Set<Integer> set = new HashSet<>();
        
        int i = 0;
        
        int j = 0;
        
        while(j < n){
            
            while(set.contains(nums[j])){
                windowSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            
            windowSum += nums[j];
            set.add(nums[j]);
            
            if(j - i + 1 == k){
                max = Math.max(windowSum, max);
                windowSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        
        return max;
    }
}