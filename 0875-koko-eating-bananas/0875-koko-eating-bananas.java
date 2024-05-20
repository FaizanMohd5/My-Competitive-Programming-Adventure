class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    
        int low = 1;
        int high = maximum(piles);
        
        
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            int total = getTotalPerHour(piles, mid);
            if(total <= h){
                high = mid - 1;        
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return low;
        
    }
    
    public int getTotalPerHour(int[] piles, int hourly){
        
        int total = 0;
        for(int i = 0; i < piles.length; i++){
            total += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return total;
    }
    
    public int maximum(int[] piles){
        int max = 0;
        for(int i = 0; i < piles.length; ++i){
            if(max < piles[i])
                max = piles[i];
        }
        return max;
    }
}