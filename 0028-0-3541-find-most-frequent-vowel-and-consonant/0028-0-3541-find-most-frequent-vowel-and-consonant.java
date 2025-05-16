class Solution {
    public int maxFreqSum(String s) {
    
        Map<Character, Integer> freqMap = new HashMap<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int maxVowelFreq = 0, maxConsonantFreq = 0;

    
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char key = entry.getKey();
            int freq = entry.getValue();

            if (vowels.contains(key)) {
                maxVowelFreq = Math.max(maxVowelFreq, freq);
            } else {
                maxConsonantFreq = Math.max(maxConsonantFreq, freq);
            }
        }

        return maxVowelFreq + maxConsonantFreq;

    }

}