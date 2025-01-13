class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[c- 'a']++;
        }
        int answer = 0;
        for (int freq : count) {
            if (freq > 0) {
                answer += freq % 2 == 0 ? 2 : 1;
            } 
        }

        return answer;
    }
}