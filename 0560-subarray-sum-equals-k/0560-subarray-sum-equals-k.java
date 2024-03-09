class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int cumSum = 0;
        Map<Integer, Integer>map= new HashMap<>();
        
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++){
            cumSum = cumSum + nums[i];
            if(map.containsKey(cumSum - k)){
                count += map.get(cumSum - k);
            }
            map.put(cumSum , map.getOrDefault(cumSum, 0) + 1);
        }
        return count;
    }
}