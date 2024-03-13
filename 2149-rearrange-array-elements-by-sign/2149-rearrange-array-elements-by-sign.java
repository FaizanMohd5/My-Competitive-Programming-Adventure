class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;
        int i = 0;
        
        int[] resultant = new int[nums.length];
        
        while(i < nums.length){
            if(nums[i] > 0){
                resultant[positive] = nums[i];
                positive += 2;
            }
            else{
                resultant[negative] = nums[i];
                negative += 2;
            }
            i++;
        }
        
        return resultant;
        
    }
}   