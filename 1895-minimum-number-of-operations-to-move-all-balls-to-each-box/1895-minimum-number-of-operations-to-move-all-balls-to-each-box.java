class Solution {
    public int[] minOperations(String boxes) {
        int length = boxes.length();
        char[] boxes1 = boxes.toCharArray();
        int[] ans = new int[length];

        for (int i= 0 ; i < length;i++){
            int counter = 0;
            for (int j = 0 ; j < length ; j++) {
                if (boxes1[j]=='1') {
                    counter += Math.abs(j - i);
                }
            }
            ans[i] = counter;

        }

        return ans;
    }
}