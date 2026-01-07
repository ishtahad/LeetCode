class Solution {
    public boolean isHappy(int n) {
        if (n==1) return true;
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = sumOfSquare(n);
        }

        return true;
       
    }

    public int sumOfSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n/10;
        }
        return sum;
    }
}