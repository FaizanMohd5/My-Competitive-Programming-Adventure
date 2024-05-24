class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int i = 0;
        int j = arr.length - 1;
        
        while(i <= j){
            
            int mid = i + (j - i) / 2;
            
            int val = arr[mid] - (mid + 1);
            
            if(val < k){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
            
        }
        
        return k + j + 1;
        
    } 
}