class Solution {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder(address);
        for(int i = 0; i<address.length()+6; i++){
            if(stringBuilder.charAt(i)=='.'){
                stringBuilder.insert(i,'[');
                stringBuilder.insert(i+2,']');
                i = i + 2;
            }
        }
        return stringBuilder.toString();
    }
}