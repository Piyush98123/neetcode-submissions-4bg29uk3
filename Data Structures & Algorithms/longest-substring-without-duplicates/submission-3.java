class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[256];
        int start = 0;
        int end = 0;
        int len=0;
        while(end<=s.length()-1){
            char ch = s.charAt(end);
            freq[ch]++;
            while(freq[ch]>1){
                char c = s.charAt(start++);
                freq[c]--;
            }
            len = Math.max(len, end-start+1);
            end++;
        }
        return len;
    }
}
