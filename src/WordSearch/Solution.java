package WordSearch;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0|| board[0].length == 0){
            return false;
        }
        for(int i = 0;i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                if(exist(board,i,j,word,0))
                    return true;
            }
        }
        return false;
    }
    public boolean exist(char[][] board,int i,int j,String word,int length){
        if(length == word.length()){
            return true;
        }
        if(i < 0||j <0||i>board.length-1||j>board[0].length-1||word.charAt(length)!=board[i][j]){
            return false;
        }
        board[i][j] ='*';
        boolean exist = exist(board, i-1, j, word, length+1)||exist(board, i+1, j, word, length+1)||exist(board, i, j-1, word, length+1)||exist(board, i, j+1, word, length+1);
        board[i][j] = word.charAt(length);
        return exist;
    }
}
