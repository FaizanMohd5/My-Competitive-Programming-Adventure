class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        int n = candies.length;

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += candies[i];
        }

        if(sum < k){
            return 0;
        }

        int low = 1;
        int high = candies[0];
        for(int i = 1; i < n; i++){
            high = Math.max(high, candies[i]);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(predicate(candies, mid, k)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans; // or if you don't want to use ans variable, then return high instead.

    }

    public boolean predicate(int[] arr, int mid, long k){
        
        for(int i = 0; i < arr.length; i++){
            k -= arr[i] / mid;
            if(k <= 0){
                return true;
            }
        }
        
        return k <= 0;
    }

}