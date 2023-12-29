class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++){
            String[] stringList = sentences[i].split(" ");
            int sum = 0;
            for(String word : stringList)
                sum++;
            max = sum>max?sum:max;
        }
        return max;
    }
}