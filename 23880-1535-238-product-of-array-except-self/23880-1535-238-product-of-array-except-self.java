class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // 1. Calc prefix
        prefix[0] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // 2. Calc suffix
        suffix[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // product the prefix and suffix to get final answers
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){

            answer[i] = prefix[i] * suffix[i];

        }

        return answer;

        
        
    }

    /*
        
        1   1   720 720
        2   1   360 360
        3   2   120 240
        4   6   30  180
        5   24  6   144
        6   120 1   120

        TC: N + N + N = 3N ~= N
        SC: N + N + N = 3N ~= N
        
    
    */

}

/*



*/
