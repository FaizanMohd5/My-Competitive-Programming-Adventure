class Solution {
    public int maxDifference(String s) {
        
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maximumOddFrequency = Integer.MIN_VALUE;
        int minimumEvenFrequency = Integer.MAX_VALUE;

        for(int freq: map.values()){

            if(freq % 2 == 1){
                maximumOddFrequency = Math.max(maximumOddFrequency, freq);
            } else {
                minimumEvenFrequency = Math.min(minimumEvenFrequency, freq);
            }

        }
        return maximumOddFrequency - minimumEvenFrequency;
    }
}
