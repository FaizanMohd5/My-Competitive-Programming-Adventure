//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int []frequency = new int[100001];
        boolean status = false;
        for(int num: arr){
            frequency[num]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                list.add(i);
                status = true;
            }
        }
        if(status)
            return list;
        else
            return new ArrayList<>(Collections.singletonList(-1));
    }
}
