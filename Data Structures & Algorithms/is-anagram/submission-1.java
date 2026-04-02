class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char A[] = s.toCharArray();
        char B[] = t.toCharArray();
        int freq[]=new int[26];
        for(char ch : A){
            freq[ch-'a']++;
        }
        for(char ch : B){
            if(freq[ch-'a']==0) return false;
            freq[ch-'a']--;
        }
        return true;
    }
}
