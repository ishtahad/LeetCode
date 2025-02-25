class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Brute force
        /*
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
        */
        // Optimal Sliding window
        int windowSum = 0, maxSum = 0;
        
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; 
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double)maxSum/k;

    }
}