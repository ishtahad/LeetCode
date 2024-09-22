class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> countS = new HashMap<>();
        HashMap<Character,Integer> countT = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            if(countS.containsKey(s.charAt(i))){
                countS.put(s.charAt(i), countS.get(s.charAt(i)) + 1);
            }else{
                countS.put(s.charAt(i), 1);
            }
        }

        for(int i = 0 ; i < t.length() ; i++){
            if(countT.containsKey(t.charAt(i))){
                countT.put(t.charAt(i), countT.get(t.charAt(i)) + 1);
            }else{
                countT.put(t.charAt(i), 1);
            }
        }
        for (Map.Entry<Character,Integer> mapElement : countS.entrySet()) {
            Character key = mapElement.getKey();
            Integer value = (mapElement.getValue());
            //System.out.println(key + " : " + value);

            if(countT.containsKey(key)){
                Integer value2 = countT.get(key);
                if(value.equals(value2)) continue;
                else {
                    System.out.println("false for key: " + key + " valueS: " + value + " valueT: " + value2 + "  " + (value.equals(value2)));
                    return false;
                }
            }else{
                System.out.println("false for : " + key + " : " + value);
                return false;
            }
        }

        return true;
        
    }
}