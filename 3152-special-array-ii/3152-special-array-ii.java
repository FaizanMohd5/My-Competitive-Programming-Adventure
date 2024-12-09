class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int[] converted = new int[nums.length];
        converted[0] = 0;
        for(int i = 1, j = 0; i < nums.length; ++i){
            if(nums[i]%2 == nums[i-1]%2) j++;
            converted[i] = j;
        }
        for(int i = 0; i < queries.length; ++i) 
            ans[i] = (converted[queries[i][0]] == converted[queries[i][1]]);
        return ans;
    }
}