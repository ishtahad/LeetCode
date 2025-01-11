class Solution {
    public boolean canConstruct(String s, int k) {
        int length = s.length();
        if (length < k) return false;
        if (length == k) return true;
        
        int[] count = new int[26];
        for (int i = 0 ; i < length ; i++) {
            count[s.charAt(i)-'a']++; 
        }

        int counter = 0;
        for (int i = 0 ; i < 26 ; i++) {
            if (count[i] % 2 != 0) {
                counter = counter + (count[i] % 2);
            }
        }
        if (counter > k ) return false;
        return true;
    }
}