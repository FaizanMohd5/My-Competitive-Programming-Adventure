class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        
        int low = 1;
        
        int high = maximum(quantities);
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            
            if(predicate(n, mid, quantities)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return low;
        
    }
    
    public boolean predicate(int n, int amount, int[] arr){
        
        int stores = 0;
        
        for(int num: arr){
            
            stores += (num + amount - 1) / amount;
            
            if(stores > n){
                return false;
            }
            
        }
        
        return stores <= n;
        
    }
    
    private int maximum(int[] arr){
        
        int max = arr[0];
        
        for(int num: arr){
            
            max = Math.max(max, num);
            
        }
        
        return max;
        
    }
    
}