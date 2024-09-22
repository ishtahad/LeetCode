class Solution {
    public boolean isAnagram(String s, String t) {

       if (s.length() != t.length()) return false;

        int[] count = new int[26];

        HashMap<Character,Integer> countS = new HashMap<>();

        for (char i : s.toCharArray()){
            count[ i - 'a']++;
        }

        for (char i : t.toCharArray()){
             count[ i - 'a']--;
        }
        
        for(int value : count){
            if(value != 0) return false;
        }

        return true;
        
    }
}