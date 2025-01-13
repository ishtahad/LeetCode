class Solution {
    public int minimumLength(String s) {
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[ c- 'a']++;
        }
        int answer = 0;
        for (int i = 0 ; i < 26 ; i++) {
            if (count[i] != 0) {
                if (count[i] % 2 == 0) {
                    answer = answer+ 2;
                } else {
                    count[i] = 1;
                    answer = answer+ 1;
                }
            } 
        }

        return answer;
    }
}