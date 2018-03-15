package UniquePathsII;

public class Solution {
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        if(obstacleGrid.length <= 0 || obstacleGrid[0].length <= 0){
//            return 0;
//        }
//        int[][] result = new int[obstacleGrid.length][obstacleGrid[0].length];
//        int temp = 1;
//        for(int i = 0; i < obstacleGrid.length;i++){
//            if(obstacleGrid[i][0] == 1){
//                temp = 0;
//                result[i][0] = temp;
//            }else{
//                result[i][0] = temp;
//            }
//        }
//        temp = 1;
//        for(int i = 0; i < obstacleGrid[0].length;i++){
//            if(obstacleGrid[0][i] == 1){
//                temp = 0;
//                result[0][i] = temp;
//            }else{
//                result[0][i] = temp;
//            }
//        }
//        for(int i = 1; i < obstacleGrid.length;i++){
//            for(int j = 1; j < obstacleGrid[0].length;j++){
//                if(obstacleGrid[i][j] == 1){
//                    result[i][j] = 0;
//                }else{
//                    result[i][j] = result[i-1][j]+result[i][j-1];
//                }
//
//            }
//        }
//        return result[obstacleGrid.length-1][obstacleGrid[0].length-1];
//    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for(int[] row:obstacleGrid){
            for(int j = 0;j < width;j++){
                if(row[j] == 1){
                    dp[j] = 0;
                }else if(j > 0){
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[width-1];
    }
}
