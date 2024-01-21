class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length +  1];
        Arrays.fill(dp,-1);
        return Math.max(recur(nums,0,dp),recur(nums,1,dp));
    }

    public int recur(int[] nums , int index,int[] dp){
        if (index > nums.length-1) return 0;
        if(index >=  nums.length-2) return dp[index]  = nums[index];
        if(dp[index] != -1)return dp[index];
        return dp[index]  =  Math.max(recur(nums,index+2,dp),recur(nums,index+3,dp))  +   nums[index];

    }
}