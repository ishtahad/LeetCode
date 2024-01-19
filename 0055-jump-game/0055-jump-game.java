class Solution {
    public boolean canJump(int[] nums) {
        int currentMaximumJump = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(i > currentMaximumJump){
                return false;
            }
            currentMaximumJump = Math.max(currentMaximumJump, i + nums[i]);   
        }
        System.gc();
        return true;

    }
}