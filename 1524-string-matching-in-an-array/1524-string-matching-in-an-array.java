class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> ans = new HashSet<>();
        int length = words.length;
          for (int i = 0 ; i < length ; i++) {
            String sub = words[i];
              for (int j = 0 ; j < length ; j++) {
                 if (i!=j) {
                    String text = words[j];
                     if (text.contains(sub)){
                         ans.add(sub);
                     }
                 }
              }
          }
           return new ArrayList(ans);
    }
}