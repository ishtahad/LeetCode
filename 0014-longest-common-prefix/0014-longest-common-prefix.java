class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String longestPref = strs[0];
        for(int i = 0 ; i < strs.length; i++){
            while(strs[i].indexOf(longestPref) != 0){
                longestPref = longestPref.substring(0,longestPref.length() -1);
                if (longestPref.isEmpty())return "";
            }
        }

        return longestPref;
    }
}