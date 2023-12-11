class Solution {
    public int findSpecialInteger(int[] arr) {
        int limit = (int) Math.ceil(arr.length/4);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > limit) 
                return num;
        }
        return 0;
    }
}