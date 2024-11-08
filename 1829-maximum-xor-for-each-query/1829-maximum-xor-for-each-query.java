class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int n = nums.length;
        
        int[] answer = new int[n];
        
        int xor = 0;
        
        for(int i = 0; i < n; i++){
            xor ^= nums[i];
        }
        
        int mask = (1 << maximumBit) - 1;
        
        for(int i = 0; i < n; i++){
            
            int k = xor ^ mask;
            
            answer[i] = k;
            
            xor ^= nums[n - i - 1];
            
        }
        
        return answer;
        
    }
}