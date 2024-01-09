class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        
        // Auxilary arrays to store the left and right maximum boundaries for each bar.
        
        int[] leftMaxBoundary = new int[height.length];
        int[] rightMaxBoundary = new int[height.length];

        // calculating maximum left boundaries for all bars (start to end index)
        leftMaxBoundary[0] = height[0]; 
        for(int i = 1; i < height.length; i++)  {
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }
        
        // calculating maximum right boundaries for all bars from right to left (last to first index)
        rightMaxBoundary[height.length - 1] = height[height.length - 1];     
        for(int i = height.length - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }
            
        // Calculating trapped water with formula: ( min(leftMaxBoundary, rightMaxBoundary) - currentBarHeight ) * width (1 for all, so we won't multiply 1 in teration)
            
        for(int i = 0; i < height.length; i++) {    
            int waterLevelFromGround = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            int barHeight = height[i];
            int surfaceAreaOfWater = waterLevelFromGround - barHeight;
            
            //Applying Kadane's algorithm to avoid negative values.
            if(surfaceAreaOfWater < 0)
                surfaceAreaOfWater = 0;  
            
            trappedWater += surfaceAreaOfWater;
        }
        
        return trappedWater;
    }
}