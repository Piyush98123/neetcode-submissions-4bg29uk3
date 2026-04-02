class Solution {

    public String encode(List<String> strs) {
        StringBuilder ecde = new StringBuilder();
        for(String s: strs){
            ecde.append(s.length()).append('#').append(s);
        }
        return ecde.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int len = Integer.parseInt(str.substring(i, j));
            j++;
            String word = str.substring(j,j+len);
            res.add(word);
            i=j+len;
        }
        return res;
    }
}
