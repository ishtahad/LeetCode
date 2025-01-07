class Solution {
    public List<String> stringMatching(String[] words) {
    // Use a Set to avoid duplicate substrings
    Set<String> resultSet = new HashSet<>();
    
    // Sort the words array based on string lengths
    Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
    
    int length = words.length;
    for (int i = 0; i < length; i++) {
        String sub = words[i];
        for (int j = i + 1; j < length; j++) { // Compare only with longer strings
            String text = words[j];
            if (text.contains(sub)) {
                resultSet.add(sub);
                break; // No need to check further for this substring
            }
        }
    }
    
    // Convert the Set to a List and return
    return new ArrayList<>(resultSet);
}
}