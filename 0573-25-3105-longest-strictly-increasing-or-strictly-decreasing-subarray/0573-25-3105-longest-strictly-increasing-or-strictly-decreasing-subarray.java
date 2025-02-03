class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int n = nums.length;
        
        if(n == 0) return 0;

        int increase = 1;
        int decrease = 1;

        int max = 1;

        for(int i = 1; i < n; i++){

            if(nums[i] > nums[i - 1]){
                increase++;
                decrease = 1;
            }
            else if(nums[i] < nums[i - 1]){
                decrease++;
                increase = 1;
            }
            else
            {
                increase = 1;
                decrease = 1;
            }
            max = Math.max(max, Math.max(increase, decrease));

        }

        return max;
    }
}