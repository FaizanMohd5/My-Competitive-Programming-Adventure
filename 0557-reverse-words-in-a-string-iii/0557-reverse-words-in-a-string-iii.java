class Solution {
    public String reverseWords(String s) {
        String[] string = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < string.length; i++) {
            sb.append(new StringBuilder(string[i]).reverse() + " ");
        }
        
        return sb.toString().trim();
    }
}