package NQueensII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private final static Set<Integer> colSet = new HashSet<>();
    private final static Set<Integer> leftSet = new HashSet<>();
    private final static Set<Integer> rightSet = new HashSet<>();
    public int totalNQueens(int n) {
        return helper(0,0,n);
    }
    public int helper(int row,int count,int n){
        for(int col = 0; col < n;col++){
            if(colSet.contains(col)){
                continue;
            }
            if(leftSet.contains(col+row)){
                continue;
            }
            if(rightSet.contains(col-row)){
                continue;
            }
            if(row == n-1){
                count++;
            }else{
                colSet.add(col);
                leftSet.add(col+row);
                rightSet.add(col-row);
                count = helper(row+1,count,n);
                colSet.remove(col);
                leftSet.remove(col+row);
                rightSet.remove(col-row);
            }
        }
        return count;
    }


}
