class Solution {
    public List<String> stringMatching(String[] words) {
        // Concatenate all words into one large string with delimiters
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("#"); // Use a delimiter to separate words
        }
        String combined = sb.toString();

        List<String> ans = new ArrayList<>();
        for (String word : words) {
            // Check if the word appears more than once in the combined string
            if (combined.indexOf(word) != combined.lastIndexOf(word)) {
                ans.add(word);
            }
        }
        return ans;
    }
}