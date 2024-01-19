class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
       // System.out.println("Insering into hashmap");
        for(int a : nums1){
            for(int b : nums2){
              //  System.out.println(a + " ," + b);
                map.put(a+b,map.getOrDefault(a+b,0) + 1);
            }
        }
       // System.out.println("VALUES OF HASH MAP");
       // map.forEach((k, v)-> System.out.println(k + " : "+ v));

      //  System.out.println("Increment the amount of count");
        for(int a : nums3){
            for(int b : nums4){
               // System.out.println(a + " ," + b);
                count += map.getOrDefault(-(a+b),0);
            }
        }

        return count;
    }
}