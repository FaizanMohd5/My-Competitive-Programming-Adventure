class Solution {
    public String largestGoodInteger(String num) {

        int n = num.length();
        
        
        String[] goodNumbers = {
            "999", "888", "777", "666", "555", "444", "333", "222", "111", "000"
        };

        for(String goodNumber: goodNumbers){
            for(int i = 0; i <= n - 3; i++){
                if(goodNumber.equals(num.substring(i, i + 3))){
                    return goodNumber;
                }
            }
        }

        return "";

    }
}