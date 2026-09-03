class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums ) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Integer> sortedAsc = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),      
                        entry -> entry.getValue(),   
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : sortedAsc.entrySet()) {
            if (k == 0) break;
            result[i] = entry.getKey();
            i++;
            k--;

        }
        return result;

    }
}