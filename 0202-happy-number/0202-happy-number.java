class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen = new HashSet<>();
        
        while(n != 1){
            
            if(seen.contains(n)){
                return false;
            }
            
            seen.add(n);
            
            n = getSquaredSum(n);
            
        }
        
        return true;
    }
    
    private int getSquaredSum(int n){
        
        int sum = 0;
        
        while(n > 0){
        
            int last = n % 10;
        
            sum += last * last;
            
            n = n / 10;
        
        }
        
        return sum;
        
    }
        
}