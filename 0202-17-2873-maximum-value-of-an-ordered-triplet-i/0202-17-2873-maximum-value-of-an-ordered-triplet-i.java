class Solution {
    public long maximumTripletValue(int[] nums) {
        
        int n = nums.length;

        long maximumValue = Long.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    long value = nums[i] - nums[j];
                    value *= nums[k];
                    if(value > maximumValue){
                        maximumValue = value;
                    }
                }
            }
        }

        return maximumValue >= 0 ? maximumValue: 0;

    }
}