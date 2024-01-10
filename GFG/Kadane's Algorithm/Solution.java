class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long max = Integer.MIN_VALUE;
        
        long currentSum = 0;
        
        for(int i=0; i<n; i++){
            currentSum = Math.max(arr[i] ,currentSum + arr[i]);
            
            if( max < currentSum )
                max = currentSum;
            
            if(currentSum < 0)
                currentSum = 0;
                
        }
        return max;
    }
    
}
