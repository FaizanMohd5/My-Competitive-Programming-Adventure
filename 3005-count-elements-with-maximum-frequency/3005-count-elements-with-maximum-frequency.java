class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[101];
        
        for(int i = 0; i < nums.length; i++)
            freq[nums[i]]++;
        
        
        int maxFrequency = 0;
        for(int i = 0; i < freq.length; i++)
            maxFrequency = Math.max(maxFrequency, freq[i]);
        
        int maxCount = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i]==maxFrequency)
                maxCount+=freq[i];
        }
        
        return maxCount;
    
    }
}