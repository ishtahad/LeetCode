class Solution {
    public int mostFrequentEven(int[] nums) {
           int bestNum = 100000;
           int bestCount = -9999;
           HashMap<Integer, Integer> countMap = new HashMap<>();

           for (int i = 0 ; i < nums.length ; i++) {
               if (nums[i] % 2 ==0) {
                    countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);

                    if (bestCount < countMap.get(nums[i])) {
                        bestNum = nums[i];
                        bestCount = countMap.get(nums[i]);
                    } else if (bestCount == countMap.get(nums[i]) && bestNum > nums[i]) {
                        bestNum = nums[i];
                    }
               }
           }

           return bestNum == 100000 ? -1 : bestNum;
    }
}