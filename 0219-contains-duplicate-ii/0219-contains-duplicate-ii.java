class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        for (int i = 0 ; i < length - 1 ; i ++) {
            for (int j = i + 1 ; j < length ; j++) {
                if (Math.abs(i - j) > k) {
                    break;
                }
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}