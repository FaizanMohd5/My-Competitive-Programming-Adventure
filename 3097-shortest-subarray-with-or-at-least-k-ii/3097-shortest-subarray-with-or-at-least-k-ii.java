class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if(k == 0)
            return 1;
        
        int minLen =Integer.MAX_VALUE;
        int orValue=0;

        for(int i = 0;i < nums.length;i++){
            orValue |= nums[i];
            if(orValue >= k){
                int or1 = 0;
                int j = i;
                while(or1 < k){
                    or1 |= nums[j--];
                }
                minLen = Math.min(minLen, i-j);
                orValue = 0;
                i = j + 2;
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}