class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> values = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );
        
        int n = s.length();
        
        int total = 0;
        
        
        for(int i = 0; i < n; i++){
            
            char curr = s.charAt(i);
            
            if((i+1) < n && values.get(curr) < values.get(s.charAt(i+1))){
                total -= values.get(curr);
            }
            else{
                total += values.get(curr);
            }
        }
        
        return total ;
        
    }
}