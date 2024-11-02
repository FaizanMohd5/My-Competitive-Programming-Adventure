class Solution {
    
    public boolean isCircularSentence(String sentence) {
        
        int length = sentence.length();
        
        if(sentence.charAt(0) != sentence.charAt(length - 1)){ 
            
            return false;
        
        }
        
        for(int i = 0; i < length; i++){
            
            if(sentence.charAt(i) == ' '){
                
                if(sentence.charAt(i - 1) != sentence.charAt(i + 1)){
                    return false;
                }
               
            }
            
        }
        
        return true;
        
    }
    
}