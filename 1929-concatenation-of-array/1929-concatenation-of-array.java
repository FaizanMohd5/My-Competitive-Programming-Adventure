class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0, j = 0; i < nums.length*2; i++, j=(j!=nums.length-1)?j+1:0)
            ans[i] = nums[j];
        return ans;
    }
}