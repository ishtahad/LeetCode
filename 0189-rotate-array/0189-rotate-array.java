class Solution {
    public void rotate(int[] nums, int k) {
        /*
          THE BELOW CODE IS BBRUTE FORCE METHODD.
          IT GETS TIME LIMIT EXCEDED FOR VERY LARGE OPTION 
         */
        /*
        for(int i = 0 ; i< k; i++){
            int tem = nums[nums.length -1];
            for(int j = nums.length -1; j >= 1 ; j-- ){
                nums[j] = nums[j-1];
            }
            nums[0] = tem;
        }*/
        /**
          OPTIMAL SOLUTION
          IT USEES ROTATION TO PLACE THE DDATA WHERE IT IS SUPPOOSOE TO BE.
          INPUT : 1234567 AND K = 3
          STEP 1 : ROTATE THE LAST 3 DIGIT BECAUSE NEED TO PLACE THE LAST 3 DIGIT
                   IN THE FIRST PLACE
         */

         k = k % nums.length;
        int[] part = new int[k];
        System.arraycopy(nums, nums.length - k, part, 0, k);

        for(int i = nums.length - k -1 ; i >= 0; i--){
                nums[i+k] = nums[i];
        }

        for(int i = 0 ; i < part.length  ; i++){
            nums[i] = part[i];
        }

        
    }
}