class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        
        when you get a duplicate then just discard all the ellemtns until that duplicate last appearence
        then add this element

         */

        int n = s.length();

        int max = 0;

        int i = 0;
        int j = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while(j < n){
            System.out.println(i+" "+j+" "+max+" "+map);
            if(map.containsKey(s.charAt(j))){

                while(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(i) ,map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }

            }

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;

    }

}