class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String word2 : words2) {
            int[] freq = getFrequency(word2);

            for (int i = 0 ; i < 26 ; i++) {
                maxFreq[i] = Math.max(maxFreq[i],freq[i]);
            }
        }
        List<String> result = new ArrayList<>();

        for (String word1 : words1) {
            int[] feq = getFrequency(word1);
            boolean isSubset = true;
            for (int i = 0 ; i < 26 ; i++) {
                if (feq[i] < maxFreq[i]) {
                    isSubset = false;
                    break;
                }
            }

            if (isSubset) {
                result.add(word1);
            }
        }
        return result;
    }

    private int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        return freq;
    }
}