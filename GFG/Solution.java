class Solution
{
    public static void sort012(int a[], int n)
    {
        if(a.length==0)
            return;
        int low = 0;
        int high = n-1;
        int mid = low;
        while(mid<=high){
            if(a[mid]==0)
            {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
    }
}
