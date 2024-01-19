class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] == target){
                System.out.println("the target is in array");
                position =  i;
            }
            else if(i != nums.length -1){
                 if(nums[i] < target && nums[i + 1] > target){
                 System.out.println("the target between array");
                position = i+1;
            }
            }
            
            else if(nums[0] > target){
                 System.out.println("the target is first index array");
                position = 0;
            }
            else if(nums[nums.length -1 ] < target){
                 System.out.println("the target is last index array");
                position = nums.length;
            }
        }
        return position;
    }
}