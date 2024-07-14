class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
                System.out.println(" Trying to replace s: " + s.charAt(i) + " with a character of t: " + t.charAt(i));
                System.out.println(" First checking if character of s has already been replaced :" + map.containsKey(s.charAt(i)));
                   if ( map.containsKey(s.charAt(i))){
                       System.out.println("character of s : " + s.charAt(i) + " has already been replaced with : "  + map.get(s.charAt(i)));
                       System.out.println("Now character of t that wants to replace  : " + t.charAt(i));
                       System.out.println("t need to be same as already replaced character : " + (map.get(s.charAt(i)) == t.charAt(i)));

                       if (map.get(s.charAt(i)) == t.charAt(i)){
                        System.out.println("because it is same so we continue");
                        System.out.println("");
                        continue;
                       }else{
                        System.out.println("because it is not same so we return false");
                        return false;
                       }
                   }else if(map.containsValue(t.charAt(i))){
                       System.out.print("Now i found a character of t : " + t.charAt(i) + " which has already been used to replace ");
                       Character key = null;
                       for (Map.Entry<Character, Character> entry : map.entrySet()) {
                            if (entry.getValue().equals(t.charAt(i))) {
                                key = entry.getKey();
                            }
                        }
                        System.out.print(key);
                        System.out.println("Now i need to check if i am not trying to replace a different character");
                        if(key == s.charAt(i)) continue;
                        else return false;


                   }
                   
                   else{

                    System.out.println("replacing s : " + s.charAt(i) + " with t : " + t.charAt(i));
                    System.out.println("");
                    map.put(s.charAt(i),t.charAt(i));
                   } 
            
        }
        
        return true;
    }
}