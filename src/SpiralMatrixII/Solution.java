package SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0,bottom = n -1,left = 0,right =n-1;
        int count = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                result[top][i] = count;
                count++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                result[i][right] = count;
                count++;
            }
            right--;
            if(right >= left){
                for(int i = right; i >= left; i--){
                    result[bottom][i] = count;
                    count++;
                }
            }
            bottom--;
            if(bottom >= top){
                for(int i = bottom; i >= top; i--){
                    result[i][left] = count;
                    count++;
                }
            }
            left++;
        }
        return result;
    }
}
