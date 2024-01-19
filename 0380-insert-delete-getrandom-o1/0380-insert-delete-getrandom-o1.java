class RandomizedSet {
    HashMap<Integer,Integer> map;
    List<Integer> nums;

    public RandomizedSet() {
        map  = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
               map.put(val,nums.size());
               nums.add(val);
               return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
         if(map.containsKey(val)){
             int index = map.get(val);
             if(index != nums.size() -1 ){
                 int lastVal = nums.get(nums.size() -1);
                 nums.set(index, lastVal);
                 map.put(lastVal,index);
             }
             //System.out.println(index +": "+ lastVal);
             nums.remove(nums.size() -1);
             map.remove(val);
             return true;
         }
         return false;
    }
    
    public int getRandom() {
        Random random = new Random();;
        return nums.get(random.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */