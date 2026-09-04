class Solution {
    public int mostFrequentEven(int[] nums) {
           int bestNum = 10000000;
           int bestCount = 0;
           HashMap<Integer, Integer> countMap = new HashMap<>();

           for (int num : nums) {
               if (num% 2 ==0) {
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);

                    if (bestCount < countMap.get(num)) {
                        bestNum = num;
                        bestCount = countMap.get(num);
                    } else if (bestCount == countMap.get(num) && bestNum > num) {
                        bestNum = num;
                    }
               }
           }
           return bestCount == 0 ? -1 : bestNum;
    }
}