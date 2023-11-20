class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left+right)/2;
            if(target < mid)
                right = mid-1;
            else if(target > mid)
                left = mid+1;
            else
                return mid;
        }
        return left;
    }
}
