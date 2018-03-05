package NQueens;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] ch = new char[n][n];
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n;j++){
                ch[i][j] = '.';
            }
        }
        backtrack(result,ch,0);
        return result;
    }
    public void backtrack(List<List<String>> result,char[][] ch,int colIdx){
        if(ch[0].length == colIdx){
            result.add(convert(ch));
            return;
        }
        for(int i = 0; i < ch[0].length;i++){
            if(validate(ch,i,colIdx)){
                ch[i][colIdx] = 'Q';
                backtrack(result,ch,colIdx+1);
                ch[i][colIdx] = '.';
            }
        }

    }
    public boolean validate(char[][] ch,int x,int y){
        for(int i = 0; i < ch[0].length;i++){
            for(int j = 0; j < y;j++){
                if(ch[i][j] == 'Q' && ( x == i || x+j==y+i || x+y==i+j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public List<String> convert(char[][] ch){
        List<String> cur = new ArrayList<>();
        for(int i = 0; i < ch[0].length;i++){
            cur.add(new String(ch[i]));
        }
        return cur;
    }
}
