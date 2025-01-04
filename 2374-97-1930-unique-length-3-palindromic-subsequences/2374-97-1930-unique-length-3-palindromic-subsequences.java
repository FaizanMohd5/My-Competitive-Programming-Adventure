class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int[] arr = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            arr[i] = set.size();
        }

        int ans = 0; 

        for (char c : set) {
            int i = -1, j = -1;
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == c) {
                    if (i == -1)
                        i = k; 
                    else
                        j = k; 
                }
            }

            if (j - i > 1) {
                HashSet<Character> between = new HashSet<>();
                i++; 
                while (i < j) {
                    between.add(s.charAt(i));
                    i++;
                }
                ans += between.size(); 
            }
        }

        return ans; 
    }
}