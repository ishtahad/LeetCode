class Solution {
    public int repeatedNTimes(int[] nums) {
        int lengthOfNums = nums.length;
        int magicNumber = lengthOfNums / 2;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
           countMap.put(num, countMap.getOrDefault(num, 0) + 1);

           if (countMap.get(num) == magicNumber) {
              return num;
            }
        }

    return -1;

    }
}