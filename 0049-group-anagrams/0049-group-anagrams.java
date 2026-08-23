class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String ,List<String>> strCountMap = new HashMap<>();
        for (String str : strs) {
           HashMap<String ,String> sortStr = sortStr(str);
           if (strCountMap.containsKey(sortStr.get(str))) {
               strCountMap.get(sortStr.get(str)).add(str);
           } else {
               List<String> newList = new ArrayList<>();
               newList.add(str);
               strCountMap.put(sortStr.get(str), newList);
           }
        }
        result.addAll(strCountMap.values());
        return result;
    }

    private  HashMap<String ,String> sortStr(String str) {
        HashMap<String ,String> sortedStr = new HashMap<>();
        sortedStr.put(str, str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString());
        return sortedStr;
    }
}