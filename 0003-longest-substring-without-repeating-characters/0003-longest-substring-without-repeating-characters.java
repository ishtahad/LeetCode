class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128];
        int start = 0, end = 0, maxLen = 0, counter = 0;
        while (end < s.length()) {
                char c1 = s.charAt(end);
                if (map[c1] > 0) counter++;
                map[c1]++;
                //System.out.println(c1 + ":" +map[c1] + " counter: " + counter);
                end++;
                while (counter > 0) {
                    char c2 = s.charAt(start);
                    if (map[c2] > 1) counter--;
                    
                    map[c2]--;
                    //System.out.println("inner loop " + c2 + ":" +map[c2] + " counter: " + counter);
                    start++;
                }
                maxLen = Math.max(maxLen, end - start);
                //System.out.println(maxLen);
        }
    return maxLen;
    }
}