class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1)return true;
        HashMap<Character,Integer> countMap = new HashMap<>();
        for(String a : words){
            for(int i = 0 ; i < a.length() ; i++){
                    if(countMap.containsKey(a.charAt(i))){
                        countMap.put(a.charAt(i),countMap.get(a.charAt(i))+1);
                    }else{
                         countMap.put(a.charAt(i),1);
                    }
            }
        }

        for (Map.Entry<Character,Integer> entry : countMap.entrySet()) {
                if(entry.getValue() % words.length != 0)return false;
        }
        return true;
    }
}