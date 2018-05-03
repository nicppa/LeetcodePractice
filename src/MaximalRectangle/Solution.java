package MaximalRectangle;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int max = 0;
        int[][] dp = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if( matrix[i][j] == '0'){
                    dp[i][j] = 0;
                }
                if(matrix[i][j] == '1'){
                    if(j >= 1){
                        dp[i][j] = dp[i][j-1] + 1;
                    }else{
                        dp[i][j] = 1;
                    }
                    int min = dp[i][j];
                    for(int k = i; k >= 0;k--){
                        if(dp[k][j] > 0){
                            min = Math.min(min,dp[k][j]);
                            max = Math.max(max,(i-k+1)*min);
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }
}
