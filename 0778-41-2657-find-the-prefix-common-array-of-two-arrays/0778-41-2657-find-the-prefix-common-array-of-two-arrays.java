class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        
        Set<Integer> set = new HashSet<>();
        
        int[] answer = new int[n];
        
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j <= i; j++){
                if(A[i] == B[j] || set.contains(B[j])){
                    count++;
                }
            }
            answer[i] = count;
            set.add(A[i]);
        }
        
        return answer;
        
    }
}