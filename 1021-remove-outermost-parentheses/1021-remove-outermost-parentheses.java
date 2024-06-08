class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char symbol = s.charAt(i);
            if(symbol == '(')
            {
                if(count > 0)
                    sb.append(symbol);
                
                count++;    
                
                
            }
            else{
                count--;
                
                if(count > 0)
                    sb.append(symbol);
                
            }
        }
        
        return sb.toString();
        
    }
}