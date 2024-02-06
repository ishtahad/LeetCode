class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        String[] sorted = new String[strs.length];
        for(int i = 0 ; i < strs.length;i++){
            char[] charArray1 = strs[i].toCharArray();
            Arrays.sort(charArray1);
            sorted[i] = new String(charArray1);
        }
        for(int i = 0 ; i < sorted.length;i++){
            String a = sorted[i];
            if(!map.containsKey(a)){
                map.put(a,new ArrayList<>());
            }
            map.get(a).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }


    
}