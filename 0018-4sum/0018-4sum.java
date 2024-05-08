class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int a = 0;
        while(a < n){
            
            if(a > 0 && nums[a] == nums[a - 1]){
                a++;
                continue;
            }
            
            int b = a + 1;
            
            while(b < n){
                
                if(b > a + 1 && nums[b] == nums[b - 1]){
                    b++;
                    continue;
                }
                
                int c = b + 1;
                int d = n - 1;
                
                while(c < d){
                    
                    long sum = (long)nums[a];
                    sum += nums[b];
                    sum += nums[c];
                    sum += nums[d];
                    
                    if(sum < target){
                        c++;
                    }
                    else if(sum > target){
                        d--;
                    }
                    else{
                        
                        List<Integer> innerList = Arrays.asList(nums[a], nums[b], nums[c],nums[d]);
                        
                        list.add(innerList);
                        
                        c++;
                        d--;
                        
                        while(c < d && nums[c] == nums[c - 1]) c++;
                        while(c < d && nums[d] == nums[d + 1]) d--;
                        
                    }
                    
                }
                
                b++;
                
            }
            a++;
        }
        
        return list;
    }
}