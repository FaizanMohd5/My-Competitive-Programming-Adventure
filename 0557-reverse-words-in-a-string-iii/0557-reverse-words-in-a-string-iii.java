class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String output = "";

        for(int i=0; i<arr.length;i++)
        {
        output = output +" "+ String.valueOf(new StringBuilder(arr[i]).reverse());
        }

        return output.trim();
    }
}