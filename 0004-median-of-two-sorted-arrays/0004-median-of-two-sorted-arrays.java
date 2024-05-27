class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        
        int low = 0;
        int high = m;
        
        
        
        while(low <= high){
            
            int partitionOfX = low + (high - low) / 2;
            int partitionOfY = ((m + n + 1) / 2) - partitionOfX;
            
            int XLMax = (partitionOfX == 0)?Integer.MIN_VALUE : nums1[partitionOfX - 1];
            int XRMin = (partitionOfX == m)?Integer.MAX_VALUE : nums1[partitionOfX];
            int YLMax = (partitionOfY == 0)?Integer.MIN_VALUE : nums2[partitionOfY - 1];
            int YRMin = (partitionOfY == n)?Integer.MAX_VALUE : nums2[partitionOfY];
            
            if(XLMax <= YRMin && YLMax <= XRMin){
                
                if((m + n) % 2 == 0){
            
                    return ( (double)Math.max(XLMax, YLMax) + Math.min(XRMin, YRMin) ) / 2.0;
            
                }
                return (double)Math.max(XLMax, YLMax);
            
            }
            else if(XLMax > YRMin){
                high = partitionOfX - 1;
            }
            else{
                low = partitionOfX + 1;
            }
            
        }
        
        
        return 0.0;
        
        
    }
}