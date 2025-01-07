class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> ans = new HashSet<>();
        int length = words.length;
          for (int i = 0 ; i < length ; i++) {
              for (int j = 0 ; j < length ; j++) {
                 if (i!=j) {
                     if (words[j].contains(words[i])){
                         ans.add(words[i]);
                     }
                 }
              }
          }
           return new ArrayList(ans);
    }
}