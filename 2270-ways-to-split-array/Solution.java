class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0, leftSum = 0;
        int res = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if (leftSum >= totalSum - leftSum) {
                res++;
            }
        }
        
        return res;
    }
}
