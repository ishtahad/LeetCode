class Solution {
    public String longestPrefix(String str) {
        int length = str.length();
        int[] lps = new int[length];
        int len = 0;
        lps[0] = 0;

        int i = 1;
        while (i < length) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) 
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return str.substring(0,lps[length-1]);
    }
}