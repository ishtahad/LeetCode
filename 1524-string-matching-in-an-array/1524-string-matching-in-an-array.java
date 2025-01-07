class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList();
        int length = words.length;
          for (int i = 0 ; i < length ; i++) {
            String sub = words[i];
              for (int j = 0 ; j < length ; j++) {
                 if (i!=j) {
                    String text = words[j];
                     if (text.contains(sub)){
                        if (!ans.contains(sub)) {
                               ans.add(sub);
                        }
                     }
                 }
              }
          }
           return ans;
    }
}