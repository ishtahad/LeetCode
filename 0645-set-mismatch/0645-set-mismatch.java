class Solution {
    public int[] findErrorNums(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int length = nums.length;
        int[] counter = new int[length + 1];
        
        int duplicate = 0;
        int notAvailable = 0;

        for (int i = 0; i < length; i++) {
            counter[nums[i]]++;
        }
        for (int i = 1; i < counter.length; i++) {
            if (counter[i] == 2) {
                duplicate = i;
            }
            if (counter[i] == 0) {
                notAvailable = i;
            }
        }

       /*
        for(int i = 0 ; i < length;i++){
            map.put(i+1,0);
        }

        for(int i = 0 ; i <length;i++){
            if(map.containsKey(nums[i])){
                   map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        
        

        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
            int value = (mapElement.getValue());
            if(value == (0))notAvailable = key;
            if(value == (2))duplicate = key;
        }
        */
        return  new int[]{duplicate, notAvailable};
    }
}