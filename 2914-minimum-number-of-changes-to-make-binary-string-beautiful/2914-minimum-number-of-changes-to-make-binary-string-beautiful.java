class Solution {
    public int minChanges(String s) {
        
        int length = 0;
        
        int i = 0;
        
        while(i < s.length()){
            
            if(s.charAt(i) != s.charAt(i + 1)){
                length++;
            }
            
            i += 2;
            
        }
        
        return length;
        
    }
}