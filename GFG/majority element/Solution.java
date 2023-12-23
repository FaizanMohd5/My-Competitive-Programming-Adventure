class Solution
{
    static int majorityElement(int a[], int size)
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= size/2+1) {
                result = entry.getKey();
                return result;
            }
        }
        
        return -1;
    }
}
