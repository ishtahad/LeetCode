class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sumOfApple = Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int result = 0;
        for (int i = 0 ; i < capacity.length; i++) {
            if (sumOfApple <= 0) {
                return result;
            }
            sumOfApple -= capacity[capacity.length - 1 - i];
            result++;
            
        }

        return result;


    }
}