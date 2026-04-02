class Solution {
    public String longestPalindrome(String s) {
        String res="";
        // odd length
        for(int ax=0;ax<s.length();ax++){
            int ob=1;
            int len=1;
            while(ax-ob>=0 && ax+ob<s.length()){
                if(s.charAt(ax-ob)==s.charAt(ax+ob)){
                    len+=2;
                    ob++;
                }
                else break;
            }

            if(len>res.length()){
                int si=ax-len/2;
                res=s.substring(si, si+len);
            }


        }

        // even length

        for(int ax=0; ax<s.length()-1; ax++){
            int ob=1;
            int len=0;

            while(ax-ob+1>=0 && ax+ob<s.length()){
                if(s.charAt(ax-ob+1)==s.charAt(ax+ob)){
                    len+=2;
                    ob++;
                }
                else break;
            }

            if(len>res.length()){
                int si=ax-len/2+1;
                res=s.substring(si, si+len);
            }
        }
        return res;
    }
}
