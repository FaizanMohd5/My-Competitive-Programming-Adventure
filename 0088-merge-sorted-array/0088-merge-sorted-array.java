class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []nums3 = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                if(nums1[i]!=0)
                    nums3[k] = nums1[i];
                i++;
            }
            else{
                if(nums2[j]!=0)
                    nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            nums3[k] = nums1[i];
            k++;
            i++;
        }
        while(j < n){
            nums3[k] = nums2[j];
            k++; 
            j++;
        }
        System.arraycopy(nums3, 0, nums1, 0, m + n); // instead of a loop this does the same work.
    }
}