class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] str = s.split(" ");
            HashMap<Character,String> map = new HashMap<>();

            if (pattern.length() != str.length) return false;

            for (int i = 0 ; i<pattern.length() ; i++){
                if (map.containsKey(pattern.charAt(i))){
                    String value = map.get(pattern.charAt(i));
                    if(!Objects.equals(value, str[i])) return false;
                }
                else if(map.containsValue(str[i])){
                    Character key = null;
                    for (Map.Entry<Character, String> entry : map.entrySet()) {
                        if (entry.getValue().equals(str[i])) {
                            key = entry.getKey();
                        }
                    }
                    if(key == s.charAt(i)) continue;
                    else return false;
                }
                else{
                    map.put(pattern.charAt(i),str[i]);
                }
            }

            return true;
    }
}