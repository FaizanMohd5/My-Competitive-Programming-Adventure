class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (b.difference != a.difference) {
                return b.difference - a.difference;
            }
            return b.data - a.data; 
        });

        for(int i = 0; i < arr.length; i++){
            pq.add(new Pair(Math.abs(arr[i] - x), arr[i]));
            if(pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> list = new ArrayList<>();

        while(pq.size() != 0){
            list.add(0, pq.poll().data);
        }

        Collections.sort(list);
        
        return list;
        
    }
}

class Pair{
    int difference;
    int data;  
    Pair(int difference, int data){
        this.difference = difference;
        this.data = data;
    }
}