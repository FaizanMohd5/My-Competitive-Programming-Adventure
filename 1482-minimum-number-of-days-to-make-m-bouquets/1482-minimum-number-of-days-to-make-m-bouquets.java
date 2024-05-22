class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //Edge case: If flowers required to make `m` bouquets exceeds the flowers in garden then
        // We can't make any flowers.
        
        if(m * k > bloomDay.length){
            return -1;
        }
        
        int low = minimum(bloomDay);
        int high = maximum(bloomDay);
        
        int ans = -1;
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            int count = 0;
            int boquets = 0;
            for(int i = 0; i < bloomDay.length; i++){
                if(bloomDay[i] <= mid){
                    count++;
                    if(count == k){
                        boquets++;
                        count = 0;
                    }
                }
                else{
                    count = 0;
                }
            }
            if(boquets >= m){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return ans;
        
    }
    
    public int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    
    public int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    
}