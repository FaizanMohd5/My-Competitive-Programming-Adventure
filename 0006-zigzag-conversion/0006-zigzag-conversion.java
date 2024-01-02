class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s; 
        }
        List<StringBuilder> array = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            array.add(new StringBuilder());
        }
        boolean flag = false;
        int k = 0;

        
        for(int i=0; i<s.length(); i++, k=flag?k+1:k-1){
            array.get(k).append(s.charAt(i));
            if(k==0 || k==numRows-1)
                flag = !flag;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder temp: array){
            result.append(temp);
        }
        return result.toString();
    }
}
