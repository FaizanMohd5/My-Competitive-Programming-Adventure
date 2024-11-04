class Solution {
    public String compressedString(String word) {
        
        int n = word.length();
        
        StringBuilder comp = new StringBuilder();
        
        int i = 0;
        
        while(i < n){
            
            char current = word.charAt(i);
            
            int count = 0;
            
            while(i < n && word.charAt(i) == current && count < 9){
                count++;
                i++;
            }
            
            comp.append(count);
            comp.append(current);
            
        }
        
        return comp.toString();
        
    }
}