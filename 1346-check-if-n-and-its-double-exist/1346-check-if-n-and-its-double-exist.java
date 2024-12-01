class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            int j = binarySearch(arr, 2*arr[i]);
            
            if(j != -1 && j != i){
                return true;
            }
            
        }
        
        return false;
        
    }
    
    public int binarySearch(int[] arr, int target){
        
        int left = 0;
        int right = arr.length - 1;
        
        int mid = 0;
        
        while(left <= right){
            
            mid = left + (right - left) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            
        }
        
        return -1;
        
    }
    
}