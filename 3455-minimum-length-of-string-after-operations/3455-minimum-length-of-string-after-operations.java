class Solution {
    public int minimumLength(String s) {
        int answer = 0;
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[c-'a']++;
        }
        for (int freq : count) {
            if (freq > 0) {
                answer += freq % 2 == 0 ? 2 : 1;
            } 
        }

        return answer;
    }
}