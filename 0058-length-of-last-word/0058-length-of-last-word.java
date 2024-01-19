class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
         s = s.trim();
        int i = s.length() -1;
        while (s.charAt(i) != ' '){
            length++;
            i--;
            if(i < 0)break;
        }
        return length;
    }
}