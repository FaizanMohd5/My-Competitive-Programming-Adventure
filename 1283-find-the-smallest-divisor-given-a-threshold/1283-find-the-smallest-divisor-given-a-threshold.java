class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int i = 1;
        int j = max(nums);
        
        while(i < j){
            
            int mid = i + (j - i) / 2;
            
            if(check(nums, mid, threshold)){
                j = mid;
            }
            else{
                i = mid + 1;
            }
            
        }
        
        return i;
        
    }
    
    public boolean check(int[] nums, int mid, int threshold){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Math.ceil( (double)nums[i] / mid );
        }
        return sum <= threshold;
    }
    
    public int max(int[] arr){
        int m = arr[0];
        for(int num: arr){
            if(num > m)
                m = num;
        }
        return m;
    }
    
}