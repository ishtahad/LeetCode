class Solution {
    public boolean isSubsequence(String s, String t) {
        int lengthS = s.length();
        int lengtht = s.length();

        if(lengthS > lengtht) return false;
        if(lengthS==0) return true;
        int i =0;
        int count = 0;
        for(char c : t.toCharArray()){
            if(i > lengthS-1)break;
            if(s.charAt(i) == c){  
                count++;
                i++;
            }
        }
        return count==lengthS;
        
    }
}