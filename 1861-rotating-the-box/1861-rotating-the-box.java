class Solution {
    
    public char[][] rotateTheBox(char[][] box) {
    
        int m = box.length;
        
        int n = box[0].length;
        
        //1. Move the boxes to right simulating gravity
        for(int i = 0; i < m; i++){
            
            int empty = n - 1;
            
            for(int j = n - 1; j >= 0; j--){
                
                if(box[i][j] == '*'){
                    empty = j - 1;
                }
                else if(box[i][j] == '#'){
                    
                    box[i][j] = '.';
                    
                    box[i][empty] = '#';
                    
                    empty--;
                    
                }
                
            }
            
        }
        
        reverse(box, 0, m - 1);
        
        char[][] resultant = getTranspose(box, m, n);
        
        return resultant;
        
    }
    
    public char[][] getTranspose(char[][] box, int m, int n){
        
        char[][] resultant = new char[n][m];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                resultant[j][i] = box[i][j];
            }
        }
        
        return resultant;
        
    }
    
    public void reverse(char[][] box, int i, int j){
        
        while(i < j){
            
            char[] temp = box[i];
            box[i] = box[j];
            box[j] = temp;
            
            i++;
            j--;
            
        }
        
    }
    
}