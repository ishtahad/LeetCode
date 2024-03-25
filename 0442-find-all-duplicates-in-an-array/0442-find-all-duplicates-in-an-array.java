class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] freq = new int[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        for(int i : nums){
            freq[i]++;
        }

        for(int i = 0; i < freq.length; i++){
                  if(freq[i] > 1)result.add(i);
        }
    return result;

    }
}