class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int xor = 0;

        if(n1 % 2 != 0){
            for(int num: nums2){
                xor ^= num;
            }
        }
        
        if(n2 % 2 != 0){
            for(int num: nums1){
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
    
    
    /*
    Solved optimal one using commutative and associative property of XOR.  TC: O(N1+N2) SC: O(N1+N2)
    
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
    
    */
    
    /* MOST Optimal : TC: O(N), SC: O(1)
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int xor = 0;

        if(n1 % 2 != 0){
            for(int num: nums2){
                xor ^= num;
            }
        }
        
        if(n2 % 2 != 0){
            for(int num: nums1){
                xor ^= num;
            }
        }

        return xor;

    }
    
    Idea: if nums1 has odd length that means it will be cancelled out if the length of nnums2 is even
    Same for the case where nums2 is odd and nums one is even length;
    
    nums1 = [3,2,1]
    nums2 = [5,4]
    
    (3^5)^(3^4)^(2^5)^(2^4)^(1^5)^(1^4) => cancel out the ones which appears even times (3,2,1) => (5) ^ (4) ^ (5) ^ (4) ^ (5) ^ (4) => 
        => Notice how all the elemtns of the nums 1 (odd length) are cancelled out. Now we know that a number x appearing N times in xor operation and N is odd then it simply means all the N-1 (n-1 is even) will be cancelled out, so simply take it one time;
            => 5 ^ 4 (cancelled 5s and 4s which appeared multiple times) the answer will be just the xor of the even length array [5,4] = 5^4 = 1 //
    
    
    */

}