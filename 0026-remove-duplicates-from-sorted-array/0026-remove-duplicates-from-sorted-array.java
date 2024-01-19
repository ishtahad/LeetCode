class Solution {
    public int removeDuplicates(int[] nums) {
        int endOfNum = nums.length -1 ;
        for(int  i = 0 ; i <= endOfNum ; i++){
            for(int j = i + 1 ; j <= endOfNum ; ){
                if(nums[i] == nums[j]){
                    int tem = nums[j];
                    for(int k = j ; k < nums.length -1; k++ ){
                        nums[k] = nums[k+1];
                    }
                    nums[nums.length -1] = tem;
                    endOfNum--;
                }else{
                    j++;
                }
            }
        }
        return endOfNum + 1;
    }
}