class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int longestStreak = 0;

        for(int i = 0; i < n; i++){
            if(!set.contains(nums[i] - 1)){
                int current = nums[i];
                int streak = 1;

                while(set.contains(current + 1)){
                    streak++;
                    current++;
                }

                longestStreak = Math.max(streak, longestStreak);

            }
        }

        return longestStreak;
    }
}
