class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[ c- 'a']++;
        }
        int answer = 0;
        for (int i = 0 ; i < 26 ; i++) {
            if (count[i] > 0) {
                answer += count[i] % 2 == 0 ? 2 : 1;
            } 
        }

        return answer;
    }
}