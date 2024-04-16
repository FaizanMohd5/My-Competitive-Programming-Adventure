class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        List<String> strings = new ArrayList<>();
        
        String[] string = s.split(" ");
        
        Map<Character, String> map = new HashMap<>();
        
        if(pattern.length() != string.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++)
        {
            char key = pattern.charAt(i);
            String value = string[i];
            if(map.containsKey(key)){
                if(!map.get(key).equals(value)){
                    return false;
                }
            }
            else {
                if (map.containsValue(value)) {
                    return false;
                }
                map.put(key, value);
            }
        }
        return true;
        
    }
}