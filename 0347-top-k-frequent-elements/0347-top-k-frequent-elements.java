class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums ) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());
        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (k == 0) break;
            result[entries.indexOf(entry)] = entry.getKey();
            k--;
        }
        return result;

    }
}