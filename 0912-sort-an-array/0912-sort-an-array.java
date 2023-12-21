class Solution {
    public int[] sortArray(int[] nums) {
        nums = mergeSort(nums,0, nums.length-1);
        return nums;
    }
    public int[] mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }
    public void merge(int[] arr, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        
        for(int i=0; i < n1; i++)
            array1[i] = arr[start + i];
        for(int i=0; i < n2; i++)
            array2[i] = arr[mid+1 + i];

        int i = 0;
        int j = 0;
        int k = start;
        while(i < n1 && j < n2){
            if(array1[i] < array2[j])
                arr[k] = array1[i++];
            else
                arr[k] = array2[j++];
            k++;
        }
        while(i<n1)
            arr[k++] = array1[i++];
        while(j<n2)
            arr[k++] = array2[j++];
    }
}