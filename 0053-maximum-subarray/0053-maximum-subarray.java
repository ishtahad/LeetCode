class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = Math.max(nums[i],max_ending_here + nums[i]); 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
         
        } 
        return max_so_far; 
    } 
    
}