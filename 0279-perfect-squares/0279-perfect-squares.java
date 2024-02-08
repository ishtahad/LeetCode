class Solution {
    int[] dp = new int[10001];
    public int numSquares(int n) {
        
        Arrays.fill(dp,-1);
        return recur(n);
    }
   
    public int recur(int n){
         if(n == 0) return 0;
         if (dp[n] != -1 ) return dp[n];
             int minCount = Integer.MAX_VALUE;
         for(int i = 1 ; i*i <= n ; i++){
             int result = 1 + recur(n - i*i);
             minCount = Math.min(minCount,result);
         }
        
        return dp[n] = minCount;
        
    }
}