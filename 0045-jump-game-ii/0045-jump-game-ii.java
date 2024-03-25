class Solution {
    int jumperCounter = 0;
    public int jump(int[] nums) {
       int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return jumpRecur(nums, 0, dp);
    }

    private int jumpRecur(int[] nums, int index, int[] dp) {
        if(index >= nums.length - 1) {
            return 0;
        }

        if(dp[index] != -1) {
            return dp[index];
        }

        int jumps = nums[index];
        int min = Integer.MAX_VALUE / 2;

        for(int i = 1; i <= jumps; i++) {
            min = Math.min(min,  1 + jumpRecur(nums, index + i, dp));
        }

        dp[index] = min;
        return min;
    }
}