class Solution {
    public String longestPrefix(String str) {
        int[] lps = new int[str.length()];
        int len = 0;
        lps[0] = 0;

        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return str.substring(0,lps[str.length()-1]);
    }
}