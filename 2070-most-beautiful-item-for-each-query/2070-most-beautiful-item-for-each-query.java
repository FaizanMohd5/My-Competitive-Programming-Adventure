class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        
        int lengthOfQueries = queries.length;
        
        int lengthOfItems = items.length;
        
        int[] answer = new int[lengthOfQueries]; 
        
        int maxSoFar = items[0][1];
        for(int i = 1; i < lengthOfItems; i++){
            maxSoFar = Math.max(items[i][1], maxSoFar);
            items[i][1] = maxSoFar;
        }
        
        for(int i = 0; i < lengthOfQueries; i++){
            
            answer[i] = getMaximumBeauty(items, queries[i]);
            
        }
        
        return answer;
        
    }
    
    public int getMaximumBeauty(int[][] items, int query){
        
        int left = 0;
        int right = items.length - 1;
        
        int max = 0;
        
        while(left <= right){
            
            int mid = left + (right - left) / 2; 
            
            if(items[mid][0] <= query){
                max = Math.max(max, items[mid][1]);
                left = mid + 1;
            }
            else{
                right = mid - 1;    
            }
            
        }
        
        return max;
        
    }
    
}

/* BRUTE FORCE

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        
        int lengthOfQueries = queries.length;
        
        int[] answer = new int[lengthOfQueries]; 
        
        for(int i = 0; i < lengthOfQueries; i++){
            
            int query = queries[i];
            
            int max = 0;
            
            for(int j = 0; j < items.length; j++){
                
                if(items[j][0] <= query && max < items[j][1]){
                    max = items[j][1];
                }
                
            }
            
            answer[i] = max;
            
        }
        
        return answer;
        
    }
}

*/

