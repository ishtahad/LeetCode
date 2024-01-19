class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hassetResult =new HashSet();
        
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            int low = i + 1;
            int high = nums.length -1;
            while (low <high){
                if(nums[i] + nums[low] + nums[high] == 0){
                                List<Integer> list = new ArrayList();
                                list.add(nums[i]);
                                list.add(nums[low]);
                                list.add(nums[high]);
                                hassetResult.add(list);
                                low++;
                                high--;
                }else if((nums[i] + nums[low] + nums[high]) < 0){
                    low++;
                }else{
                    high --;
                }
            }
        }
        List<List<Integer>> finalResult = new ArrayList<>(hassetResult);
        return finalResult;
    }
}