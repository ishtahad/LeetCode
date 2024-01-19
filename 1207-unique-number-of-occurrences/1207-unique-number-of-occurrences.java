class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        } 
        Set valueset=new HashSet(map.values());
        return map.size() == valueset.size();
    }
}