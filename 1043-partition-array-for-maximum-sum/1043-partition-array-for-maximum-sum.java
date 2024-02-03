class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int size = arr.length;
        int[] dp = new int[size];
        Arrays.fill(dp,-1);
        return recur(arr,k,0,size,dp);


    }

    public int recur(int[] arr, int k,int i,int size,int[] dp){
        if(i >= size) return 0;
        if(dp[i] != -1) return dp[i];

        int result = 0;
        int cur = -1;

        for(int j = i ; j < size && (j -i +1) <= k;j++){
            cur = Math.max(cur,arr[j]);
            result = Math.max(result,((j-i+1) * cur) +  recur(arr,k,j+1,size,dp));
        }
        //System.out.println(arr[i] +" : " + cur + " : "+result);
        return dp[i] = result;

    }
}