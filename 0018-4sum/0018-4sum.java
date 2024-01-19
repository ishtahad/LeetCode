class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) { 
        Set<List<Integer>> resultS = new  HashSet();  
        Arrays.sort(nums);
        int size = nums.length;
        long targetL = (long)target;
        for(int i = 0 ; i <size - 3; i++){
            for(int y = i+ 1 ; y< size - 2 ; y++){
                int k = y+ 1;
                int l = size -1;
                while(k<l){
                    long sum = ((long)nums[i] + (long)nums[y] + (long)nums[k]+ (long)nums[l]);
                    if( sum == targetL){  
                           List<Integer> list = new ArrayList();
                           list.add(nums[i]);
                           list.add(nums[y]);
                           list.add(nums[k]);
                           list.add(nums[l]); 
                           resultS.add(list); 
                           k++;
                           l--;
                    }
                    if(sum < targetL){
                          k++;
                    }else if(sum > targetL){
                        l--;
                    }
                }
            }
        }
        List<List<Integer>> resultL = new ArrayList<>(resultS);
        return resultL;
    }
}