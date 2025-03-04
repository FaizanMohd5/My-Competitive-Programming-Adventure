class Solution {
    public int[] transformArray(int[] nums) {
        
        int n = nums.length;

        for(int i = 0; i < n; i++){
            
            nums[i] = (nums[i] % 2 == 0)? 0: 1;

        } // - O(n)

        // 0,1,0,1 -> 2 (0,1)

        int[] arr = new int[n];

        //sort logic
        int zeroIndex = 0;
        int oneIndex = n - 1;
        for(int i = 0; i < n; i++){

            if(nums[i] == 0){
                arr[zeroIndex] = 0;
                zeroIndex++;
            }
            else{
                arr[oneIndex] = 1;
                oneIndex--;
            }

        }

        return arr;

    }
}
