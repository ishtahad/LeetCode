class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> countMagazine = new HashMap<>();
            HashMap<Character,Integer> countRansomnote = new HashMap<>();

            for(int i = 0; i<ransomNote.length();i++){
                if(!countRansomnote.containsKey(ransomNote.charAt(i))){
                    countRansomnote.put(ransomNote.charAt(i),1);
                }else{
                    countRansomnote.put(ransomNote.charAt(i),countRansomnote.get(ransomNote.charAt(i)) + 1);
                }
            }

            for(int i = 0; i<magazine.length();i++){
                if(!countMagazine.containsKey(magazine.charAt(i))){
                    countMagazine.put(magazine.charAt(i),1);
                }else{
                    countMagazine.put(magazine.charAt(i),countMagazine.get(magazine.charAt(i)) + 1);
                }
            }

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