class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] nums2 = new int[nums.length];
        int zeroIndex = -1;
        
        Arrays.fill(nums2,1);
        int product = 1;

        boolean allZeros = Arrays.stream(nums).allMatch(num -> num == 0);
        long zeroCount = Arrays.stream(nums).filter(num -> num == 0).count();

        if(allZeros){return nums;}
        if(zeroCount > 1){return new  int[nums.length];}

        for (int i = 0; i< nums.length;i++){
            if(nums[i] == 0 ){
                zeroIndex = i;
                continue;
            }
            product = product*nums[i];
            nums2[i] = product;
        }
        
        for (int i = 0; i< nums.length;i++){
            if(nums[i] == 0 ){
                nums2[i] = product;
            }else{
                 nums2[i] = product/nums[i];
            }
            
        }
        if(zeroIndex != -1){
            for (int i = 0; i< nums2.length;i++){
                if(i != zeroIndex ){
                    nums2[i] = 0;
                }else{
                    nums2[i] = nums2[i];
                }
            
            }
        }
        return nums2;
    }
}

//1 ,2,3,4
