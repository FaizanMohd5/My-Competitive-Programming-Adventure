class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
        int n = nums.length;
              
        long[] prefixSum = new long[n + 1];
        
        for(int i = 1; i <= n; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        Deque<Integer> indices = new ArrayDeque<>();
        
        int minimum = Integer.MAX_VALUE;
        
        for(int i = 0; i <= n; i++){
            
            while(!indices.isEmpty() && prefixSum[i] - prefixSum[indices.peekFirst()] >= k){
                minimum = Math.min(minimum, i - indices.pollFirst());
            }
            
            while(!indices.isEmpty() && prefixSum[i] <= prefixSum[indices.peekLast()]){
                indices.pollLast();
            }
        
            indices.offerLast(i);
            
        }
        
        return minimum == Integer.MAX_VALUE ? -1 : minimum;
    }
    
    /*
    Sliding window problem!
    
    Thought process:
    Why sliding window? 
    
    1. Subarray
    2. sum at least K
    
    
    Prerequisite(better): leetcode 209 [https://leetcode.com/problems/minimum-size-subarray-sum/]
    */
    
}