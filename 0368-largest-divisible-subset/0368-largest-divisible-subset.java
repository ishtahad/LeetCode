class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);

        int[] previous = new int[length];
        Arrays.fill(previous, -1);

        int lastChosenIndex = 0;
        int maxL = 1;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        previous[i] = j;
                    }

                    if (dp[i] > maxL) {
                        maxL = dp[i];
                        lastChosenIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while (lastChosenIndex >= 0) {
            result.add(nums[lastChosenIndex]);
            lastChosenIndex = previous[lastChosenIndex];
        }

        return result;
        
    }
    
    
}