class Solution {
    public int[] twoSum(int[] nums, int target) {
        int resultantArray[] = null;
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(i==j) continue;
                if(nums[i]+nums[j]==target ){
                    resultantArray = new int[]{i,j};
                    return resultantArray;
                }
            }
        }
        return resultantArray;
    }
}