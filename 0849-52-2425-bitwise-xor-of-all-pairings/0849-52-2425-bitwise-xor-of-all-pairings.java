class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int xor = 0;

        HashMap<Integer, Integer>map = new HashMap<>();
        
        for(int i = 0; i < n1; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + n2);
        }
        
        for(int i = 0; i < n2; i++){
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) + n1);
        }
        
        for(int num: map.keySet()){
            if(map.get(num) % 2 != 0){
                xor ^= num;
            }  
        }

        return xor;

    }

    /* BRUTE FORCE TC: O(N^2), SC: O(N)
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        List<Integer> list = new ArrayList<>();

        int xor = 0;

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                list.add(nums1[i] ^ nums2[j]);
            }
        }

        for(Integer num: list){
            xor = xor ^ num;
        }

        return xor;

    }
    */

    /* BRUTE FORCE TC:O(N^2), SC: O(1)
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int xor = 0;

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                xor = xor ^ (nums1[i] ^ nums2[j]);
            }
        }

        return xor;

    }
     */

}