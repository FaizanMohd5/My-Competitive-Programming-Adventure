class Solution {
    
    public long solve(int i, int[][] q, long [] dp){
        
        if(i >= q.length){
            return 0;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        long selected = q[i][0] + solve(i + q[i][1] + 1, q, dp);
        
        long notSelected = solve(i + 1, q, dp);
        
        dp[i] = (selected > notSelected) ? selected : notSelected;
        
        return dp[i];
        
    }
    
    public long mostPoints(int[][] q) {

        int n = q.length;

        long[] dp = new long[n];
        for(int i = 0; i < n; i++){
            dp[i] = -1;
        }
        
        return solve(0, q, dp);
        
    }

}