class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int result = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix.length];
        for(int i = 0 ; i < matrix.length; i++){
           Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for(int i = 0 ; i < matrix.length  ; i++){
               result = Math.min(result, recur(matrix,0,i,dp));   
        }
        return result;
    }

   
    public int recur(int[][] matrix, int row, int column ,int[][] dp){ 
        if(dp[row][column] != Integer.MAX_VALUE) return dp[row][column];
        if(row == matrix.length -1) return dp[row][column] =  matrix[row][column];
        int leftMin = Integer.MAX_VALUE;
        int rightMin = Integer.MAX_VALUE;
        if(column > 0){
            leftMin =  recur(matrix,row + 1, column -1,dp);
        }
        int centreMin =  recur(matrix,row + 1, column,dp);
        if(column < matrix[0].length -1){
             rightMin = recur(matrix,row + 1, column +1,dp);
        }
        return dp[row][column] = Math.min(leftMin,Math.min(centreMin,rightMin)) + matrix[row][column];    
    }
    
}