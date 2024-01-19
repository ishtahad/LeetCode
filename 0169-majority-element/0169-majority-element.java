class Solution {
    public int majorityElement(int[] nums) {
        int result  = nums[0];
        int counterMax = 0;

        // BRUTE FORCE 
        /*
        for(int n : nums){
            int count = 0;
            for(int m : nums)
                   if(n == m)
                    count++;    
            if(count > counterMax){
                counterMax = count;
                result = n;
            }
        }
        */
        // BETTER SOLUTION USING HASHMAAP
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
               if(value > nums.length/2) return key;
        }
        return -1;
        */
        // OPTIMAL SOLUTION MOORES ALGORITHM
        for(int n : nums){
            if(counterMax == 0){
                result = n;
                counterMax++;
            }else if(n == result)counterMax++;
            else if(n != result) counterMax--;
        }

        return result;
        
    }
}