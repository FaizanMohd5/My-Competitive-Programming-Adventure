class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> set: map.entrySet()){
            if(set.getValue() == 1)
                return set.getKey();
        }
        return -1;
    }
}
