class LRUCache {

    LinkedHashMap<Integer, Integer> lhm;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        lhm = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        return lhm.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        lhm.put(key,value);
         if (lhm.size() > capacity) {
            lhm.pollFirstEntry();
        }
    }


}
