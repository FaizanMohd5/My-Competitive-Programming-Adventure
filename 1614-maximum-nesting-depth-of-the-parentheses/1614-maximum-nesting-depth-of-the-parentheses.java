class Solution {
    public int maxDepth(String s) {
        
        int count = 0;
        int max = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') count++;
            else if(ch == ')'){
                count--; 
            }
            max = Math.max(count, max);
        }
        
        return max;
        
    }
}