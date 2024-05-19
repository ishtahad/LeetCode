class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> countMagazine = new HashMap<>();
            HashMap<Character,Integer> countRansomnote = new HashMap<>();

            for(int i = 0; i<ransomNote.length();i++)
                countRansomnote.put(ransomNote.charAt(i),countRansomnote.getOrDefault(ransomNote.charAt(i),0) + 1);
            

            for(int i = 0; i<magazine.length();i++)
                countMagazine.put(magazine.charAt(i),countMagazine.getOrDefault(magazine.charAt(i),0) + 1);
            

            for (Map.Entry<Character,Integer> mapElement : countRansomnote.entrySet()) {
                Character key = mapElement.getKey();
                int value = mapElement.getValue();
                if(countMagazine.containsKey(key)){
                    if(value > countMagazine.get(key)){
                        return false;
                    }
                }else{
                    return false;
                }
            }
            return true;
    }
}