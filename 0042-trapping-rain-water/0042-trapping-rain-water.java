class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        
        while(left < right){
            if(leftMax < rightMax)
            {
                left++;
                if(leftMax < height[left])
                    leftMax = height[left];
                trappedWater += leftMax - height[left];
            }
            else{
                right--;
                if(rightMax < height[right])
                    rightMax = height[right];
                trappedWater += rightMax - height[right];
            }
            
        }
        return trappedWater;
    }
}