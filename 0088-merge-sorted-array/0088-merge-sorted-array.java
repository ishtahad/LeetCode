class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        int endOfNums1 = m;
        for(int i = 0 ; i < m + n ; i++){
            for (int j = l; j<n ; j++){
                if(nums1[i] >= nums2[j]){
                    for(int k = m + n - 1 ; k > i ;k--){
                        nums1[k] = nums1[k-1];
                    }
                    endOfNums1++;
                    nums1[i] = nums2[j];
                    l++;
                    break;
                }else if( i >= endOfNums1 && nums1[i]==0){
                    nums1[i] = nums2[j];
                    l++;
                    break;
                }
            }
        }
    }
}