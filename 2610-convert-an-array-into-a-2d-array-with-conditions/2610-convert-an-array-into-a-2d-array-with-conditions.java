/*class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> countFreq = new HashMap<>();
        for(int i = 0 ;  i < nums.length ; i++){
            if(countFreq.c)
        }
    }
}*/



class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] frequent = new int[nums.length + 1];
        
        List<List<Integer>> result = new ArrayList<>();

        for (int a : nums) {

            if (frequent[a] >= result.size()) {

                result.add(new ArrayList<>());

            }

            result.get(frequent[a]).add(a);

            frequent[a]++;
        }

        return result;
    }
}
