class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int ans = 0;
        int i = 0;
        int j = tokens.length - 1;
        while(i <= j){
            if(power >= tokens[i]){
                score++;
                ans = score;
                power -= tokens[i];
                i++;
            }
            else if(score > 0){
                score--;
                power += tokens[j];
                j--;
            }
            else 
                return ans;
        }
        return ans;
    } 
}