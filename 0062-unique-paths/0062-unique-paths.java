class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
       
        return countPath(m - 1, n - 1, dp);
    }
    int countPath(int row,int col,int[][] dp){
        if(row==0 || col==0){
            return 1;
        }
        if(dp[row][col]!=0){
            return dp[row][col];
        }
        dp[row][col]=countPath(row-1,col,dp)+countPath(row,col-1,dp);
        return dp[row][col];
    }
}