class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        for(String s : strs){
            String key = getKey(s);
            freq.putIfAbsent(key, new ArrayList<>());
            freq.get(key).add(s);
        }
        return new ArrayList<>(freq.values());
    }

     public String getKey(String s){
       char[] ch = s.toCharArray();
       Arrays.sort(ch);
       return new String(ch);
    }
}
