class Solution {
    public int longestConsecutive(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],Boolean.FALSE);
        }

        int seqCount=0;
        for (int i = 0; i <arr.length ; i++) {
            int count=1;
            if(map.containsKey(arr[i])){
                map.put(arr[i], Boolean.TRUE);
            }

            // forward direction
            int nxtEle = arr[i]+1;
            while(map.containsKey(nxtEle) && map.get(nxtEle)==false){
                count++;
                map.put(nxtEle, Boolean.TRUE);
                nxtEle++;
            }
            int prev = arr[i]-1;
            while(map.containsKey(prev) && map.get(prev)==false){
                count++;
                map.put(prev, Boolean.TRUE);
                prev--;
            }
            seqCount=Math.max(seqCount, count);

        }
        return seqCount;
    }
}
