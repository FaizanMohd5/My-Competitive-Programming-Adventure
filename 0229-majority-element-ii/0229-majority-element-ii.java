class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        
        List<Integer> list = new ArrayList<>();
        
        int firstCandidate = nums[0];
        int secondCandidate = nums[0];
        
        int firstCount = 0;
        int secondCount = 0;
        
        for(int i = 0; i < n; i++){
            
            if(nums[i] == firstCandidate){
                firstCount++;
            }
            else if(nums[i] == secondCandidate){
                secondCount++;
            }
            else if(firstCount == 0){
                firstCandidate = nums[i];
                firstCount = 1;
            }
            else if(secondCount == 0){
                secondCandidate = nums[i];
                secondCount = 1;
            }
            else{
                firstCount--;
                secondCount--;
            }
            
        }
        
        firstCount = 0;
        secondCount = 0;
        
        for(int i = 0; i < n; i++){
            
            if(nums[i] == firstCandidate){
                firstCount++;
            }
            else if(nums[i] == secondCandidate){
                secondCount++;
            }
            
        }
        
        if(firstCount > n/3){
            list.add(firstCandidate);
        }
        if(secondCount > n/3){
            list.add(secondCandidate);
        }
        
        return list;
    
    }
}