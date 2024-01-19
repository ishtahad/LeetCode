class Solution {
    public int strStr(String haystack, String needle) {
        System.out.println(needle);
        if(needle.isEmpty()){
            return 0;
        }
        else if(haystack.contains(needle)){
            for( int i = 0 ; i<haystack.length();i++){
                if(haystack.charAt(i) == needle.charAt(0)
                   && 
                   haystack.charAt(i + (needle.length() -1)) ==                                        needle.charAt(needle.length() -1)){
                   
                    if(haystack.substring(i,haystack.length()).startsWith(needle)){
                        return i;
                    }
                    
                   
                }
            }
            
        }
        
        return -1;
        
    }
}