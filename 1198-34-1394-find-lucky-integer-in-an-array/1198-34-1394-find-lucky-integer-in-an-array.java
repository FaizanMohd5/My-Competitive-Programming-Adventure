class Solution {
    public int findLucky(int[] arr) {
        
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        int lucky = -1;

        for(Map.Entry<Integer, Integer> entrySet: map.entrySet()){
            if(entrySet.getKey() == entrySet.getValue() && lucky < entrySet.getKey()){
                lucky = entrySet.getKey();
            }
        }

        return lucky;

    }
}