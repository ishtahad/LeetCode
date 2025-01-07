class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> ans = new HashSet<>();
          int index = 0;
          for (int i = 0 ; i < words.length ; i++) {
              for (int j = 0 ; j < words.length ; j++) {
                 if (i!=j) {
                     if (words[j].contains(words[i])){
                         ans.add(words[i]);
                         index++;
                     }
                 }
              }
          }
           return new ArrayList(ans);
    }
}