class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int i = 0; 
        while(i < nums.length){
            if(i > 0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }    
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> innerList = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.add(innerList);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
            i++;
        }
        return list;
    }
}