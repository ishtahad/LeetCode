class Solution {
    public int[] minOperations(String boxes) {
        char[] boxes1 = boxes.toCharArray();
        int[] ans = new int[boxes.length()];

        for (int i= 0 ; i < boxes1.length;i++){
            int counter = 0;
            for (int j = 0 ; j < boxes1.length ; j++) {
                if (boxes1[j]=='1') {
                    counter += Math.abs(j - i);
                }
            }
            ans[i] = counter;

        }

        return ans;
    }
}