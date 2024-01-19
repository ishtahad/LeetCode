class Solution {
    int ans = 0;
    int[] dp = new int[46];
    public int climbStairs(int n) {
       if(n == 1) return 1;
        if(n == 2) return 2;
        //if(n == 3) return 3;
        if(dp[n] != 0) return dp[n];
        return dp[n] = climbStairs(n-1) + climbStairs(n-2);   
    }

}
/*
6
- 1,1,1,1,1,1
- 2,2,2
- 1,2,1,2
- 2,1,2,1
- 2,2,1,1
- 1,1,2,2
- 
*/
/*
1 - 1
2 - 2
3 - 3
4 - 5
5 - 8
6 - 13
7 - 21
8 - 34
*/
/*
f(8) = f(7) + f(6)
     = f(6) + f(5) + f(5) + f(4)
     = f(5) + f(4) + f(4) + f(3) + f(3) + f(2)
     = f(4) + f(3) + f(3) + f(2) + f(3) + f(2)+  3 + 3 + 2
     = f(3) + f(2) + 3 + 3 + 2 + 3 + 2+ 3 + 3+ 2
     = 3 + 2 + 3 + 3 + 2 + 3 + 2+ 3 + 3+ 2
     = 

*/