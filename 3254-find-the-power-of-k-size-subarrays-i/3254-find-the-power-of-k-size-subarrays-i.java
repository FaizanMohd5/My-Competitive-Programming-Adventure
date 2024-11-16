class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
        int n = nums.length;
        
        int[] result = new int[n - k + 1];
        
        for(int i = 0; i < result.length; i++){
            result[i] = -1;
        }
        
        int count = 1;
        
        for(int i = 1; i < k; i++){
            if(nums[i] == nums[i - 1] + 1){
                count++;
            } else {
                count = 1;
            }
        }
        
        if(count == k){
            result[0] = nums[k - 1];
        }
        
        int i = 1;
        int j = k;
        
        while(j < n){
            if(nums[j] == nums[j - 1] + 1){
                count++;
            } else {
                count = 1;
            }
            
            if(count >= k){
                result[i] = nums[j];
            }
            
            i++;
            j++;
            
        }
        
        return result;
    }
}


/* BRUTE FORCE

Time Complexity

Outer Loop: 
O(n−k)

Inner Loop: 
O(k) for each subarray

Total: 
O((n−k)⋅k)

Space Complexity

O(n−k+1) for the result array.

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
        int n = nums.length;
        
        int[] result = new int[n - k + 1];
        
        for(int i = 0; i <= n - k; i++){
            
            boolean isConsecutive = true;
            
            for(int j = i + 1; j < i + k; j++){
                
                if(nums[j - 1] + 1 != nums[j]){
                    isConsecutive = false;
                    break;
                }
                
            }
            
            result[i] = isConsecutive ? nums[i + k - 1]: -1;
            
        }
        
        return result;
    }
}

*/
