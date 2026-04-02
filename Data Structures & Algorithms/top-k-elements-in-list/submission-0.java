class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: nums){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Map.Entry::getValue));
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.add(e);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int arr[]=new int[k];
        int idx=0;
        while (!pq.isEmpty() && k>0) {
            arr[idx++]=pq.poll().getKey();
            k--;
        }
        return arr;
    }
}
