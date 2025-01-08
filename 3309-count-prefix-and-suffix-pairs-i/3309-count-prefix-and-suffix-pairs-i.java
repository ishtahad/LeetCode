class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0 ; i < words.length - 1 ; i++) {
            for (int j = i+1 ; j < words.length ; j++) {
                if (isPrefixAndSuffix(words[i],words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        int lengthPat = str1.length();
        int lengthText = str2.length();

        if (lengthPat > lengthText) {
            return false;
        }

        String textPrefix = str2.substring(0,lengthPat);
        if (!textPrefix.equals(str1)) return false;
        String textSuffix = str2.substring(lengthText-lengthPat,lengthText);
        if (!textSuffix.equals(str1)) return false;

        return true;
           
    } 
}