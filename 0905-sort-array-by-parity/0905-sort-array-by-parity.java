class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i]%2!=0 && nums[j]%2==0){
                nums[i] = nums[i]^nums[j];
                nums[j] = nums[i]^nums[j];
                nums[i] = nums[i]^nums[j];
                i++;
                j--;
            }
            else if(nums[i]%2==0)
                i++;
            else if(nums[j]%2!=0)
                j--;
            else{
                i++;
                j--;
            }
        }
        return nums;
    }
}