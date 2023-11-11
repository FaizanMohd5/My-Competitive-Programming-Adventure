class Solution {
    public int lengthOfLastWord(String s) {
        char[] charArray = s.trim().toCharArray();
        int count = 0;
        if(charArray.length==1)
            return 1;
        for(int i=charArray.length-1; i>=0 && charArray[i]!=' '; i--)
            count++;
        return count;
    }
}