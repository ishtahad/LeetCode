class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> countS = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(countS.containsKey(s.charAt(i))){
                countS.put(s.charAt(i), countS.get(s.charAt(i)) + 1);
            }else{
                countS.put(s.charAt(i), 1);
            }
        }

        for(int i = 0 ; i < t.length() ; i++){
            if(countS.containsKey(t.charAt(i))){
                countS.put(t.charAt(i), countS.get(t.charAt(i)) - 1);
            }else{
                countS.put(t.charAt(i), 1);
            }
        }
        
        for(int value : countS.values()){
            if(value != 0) return false;
        }

        return true;
        
    }
}