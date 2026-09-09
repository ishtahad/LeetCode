class Solution {
    public long countCommas(long n) {
        if (n < 1000) return 0;
        long total = 0;
        long threshold = 1000;
        while (threshold <= n) {
            total += n - threshold + 1;
            threshold *= 1000;
        }
        return total;
    }
}