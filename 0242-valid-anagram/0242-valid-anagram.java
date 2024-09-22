class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> countS = new HashMap<>();

        for (char i : s.toCharArray()){
            countS.put(i, countS.getOrDefault(i,0) + 1);
        }

        for (char i : t.toCharArray()){
            countS.put(i, countS.getOrDefault(i,0) - 1);
        }
        
        for(int value : countS.values()){
            if(value != 0) return false;
        }

        return true;
        
    }
}