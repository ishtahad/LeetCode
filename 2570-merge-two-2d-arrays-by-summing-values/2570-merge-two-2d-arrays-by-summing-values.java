class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> result = new HashMap<>();
       // Approch 1
       /*
        for(int[] a : nums1){
            result.put(a[0],a[1]);
        }

        for(int[] a : nums2){
            if(result.containsKey(a[0])){
                result.put(a[0],a[1] + result.get(a[0]));
            }else{
                result.put(a[0],a[1]);
            }
        }

        int[][] finalR = new int[result.size()][2];
        int i = 0;

        for(int key : result.keySet()){
            finalR[i][0] = key;
            finalR[i][1] = result.get(key);
            i++;
        }

        Arrays.sort(finalR,(a,b)-> a[0] - b[0]);
        */

        //Approch 2
        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                   result.put(nums1[i][0],nums1[i][1] + nums2[j][1]);
                   i++;
                   j++;
            }else if(nums1[i][0] < nums2[j][0]){
                result.put(nums1[i][0],nums1[i][1]);
                i++;
            }else if(nums1[i][0] > nums2[j][0]){
                result.put(nums2[j][0],nums2[j][1]);
                j++;
            }
        }

        while(i < nums1.length){
            result.put(nums1[i][0],nums1[i][1]);
                i++;
        }

        while(j < nums2.length){
            result.put(nums2[j][0],nums2[j][1]);
                j++;
        }

         int[][] finalR = new int[result.size()][2];
         i = 0;
        for(int key : result.keySet()){
            finalR[i][0] = key;
            finalR[i][1] = result.get(key);
            i++;
        }

        Arrays.sort(finalR,(a,b)-> a[0] - b[0]);

        return finalR;
    }
}