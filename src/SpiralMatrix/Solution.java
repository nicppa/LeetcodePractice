package SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0){
            return result;
        }
        int rowBegin = 0,rowEnd = matrix.length-1,colBegin = 0,colEnd = matrix[0].length-1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd){
            for(int i = colBegin;i <= colEnd;i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin;i <= rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowEnd >= rowBegin){
                for(int i = colEnd; i >= colBegin;i--){
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colEnd >= colBegin){
                for(int i = rowEnd; i >= rowEnd;i--){
                    result.add(matrix[i][colBegin]);
                }
            }
            colBegin++;

        }
        return result;
    }
}
