class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        if(nums.length == 2){
            return 2;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(result < 2 || nums[i] > nums[result-2])
            /*
              the Above line is quite cool.
              it validates the amount with the amount of 2 steps before.
              because one duplicate is allowed. so if nums[i] is greater that means
              it is not duplicate and it will remain in result.
            */
            {
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }
}