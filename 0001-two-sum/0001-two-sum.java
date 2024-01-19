class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int[] arr = new int[10];
        List<Integer> a= new ArrayList<>();
        for (int i =0 ;i<nums.length;i++){
            for (int y =i +1 ;y<nums.length;y++){
                if((nums[i] + nums[y]) == target){
                    a.add(i);
                    a.add(y);
                   
                }
            }
        }
        int[] arr = new int[a.size()];
        for(int i =0 ; i<a.size();i++){
            arr[i] = a.get(i);
        }
        return arr;
    }
}