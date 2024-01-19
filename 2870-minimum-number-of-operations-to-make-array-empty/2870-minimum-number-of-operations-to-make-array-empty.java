class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> countMap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            countMap.put(nums[i],countMap.containsKey(nums[i])? countMap.get(nums[i]) + 1: 1 );
        }
        for(Map.Entry<Integer,Integer> mapElement : countMap.entrySet()){
            int value = mapElement.getValue();
            if (value == 1) return -1;
            else if(value % 3 == 0){
               count = count + (value/3);
           }else if(value % 2 == 0){ 
               int a = value/3;
               int b = value%3;
               if(b==2) b = 1;
               count = count + a + b;
           }else {
               if(value > 3 && value % 3 == 1){
                   int a = value - 4;
                   count = count + (a/3) + 2;
               }else if (value > 3 && value % 3 == 2){
                   count = count + (value/3) + 1;
               }
               else{
                     return -1;
               }        
           }
        }
        return count;
    }
}