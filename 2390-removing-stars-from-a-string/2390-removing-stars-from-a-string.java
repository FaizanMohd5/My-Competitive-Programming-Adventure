class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder("");
        for(char c: s.toCharArray()){
            if(c!='*'){
                result.append(Character.toString(c));
            }
            else {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }
}