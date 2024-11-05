class Solution {
    public String truncateSentence(String s, int k) {
        
        int spaceCount = 0;
        
        StringBuilder truncated = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == ' '){
                spaceCount++;
            }
            if(spaceCount == k){
                break;
            }
            
            truncated.append(s.charAt(i));
            
        }
        
        return truncated.toString();
        
    }
}