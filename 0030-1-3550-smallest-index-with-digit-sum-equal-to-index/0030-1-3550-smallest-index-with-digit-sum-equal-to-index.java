class Solution {
    public int smallestIndex(int[] nums) {
        
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i == digitSum(nums[i])){
                return i;
            }
        }
        return -1;
    }

    public int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

}