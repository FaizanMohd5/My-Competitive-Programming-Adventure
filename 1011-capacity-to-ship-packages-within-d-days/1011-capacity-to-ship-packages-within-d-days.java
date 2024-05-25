class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int n = weights.length;
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }
        
        // search space from max to sum is visualized
        
        int low = max;
        int high = sum;
        
        while(low < high){
            int mid = low + (high - low) / 2;
            
            if(getDaysRequired(weights, mid) <= days){
                high = mid;
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return low;
        
    }
     
    public int getDaysRequired(int[] weights, int capacity){
        
        int days = 1;
        int load = 0;
        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > capacity){
                days++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }    
        
        return days;
    
    }

    
}