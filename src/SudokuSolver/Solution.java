package SudokuSolver;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public boolean solve(char[][] board,int row,int col){
        for(int i = row;i < 9;i++,col = 0){
            for(int j = col; j < 9; j++ ){
                if(board[i][j] == '.') continue;
                for(char ch = '1';ch <= '9';ch++) {
                    if (isValidSudoku(board, i, j, ch)) {
                        board[i][j] = ch;
                        if (solve(board, i, j + 1)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board,int row,int col,char num) {
        int blockRow = row/3*3,blockColumn = col/3*3;
        for(int i = 0;i < 9;i++){
            if(board[i][col]==num || board[row][i]==num||board[blockRow+i/3][blockColumn+i%3]==num){
                return false;
            }
        }
        return true;
    }
//TLE
//    public void solveSudoku(char[][] board) {
//        solve(board);
//    }
//    public boolean solve(char[][] board){
//        for(int i = 0;i < 9;i++){
//            for(int j = 0; j < 9; j++ ){
//                if(board[i][j] == '.'){
//                    for(char ch = '1';ch <= '9';ch++){
//                        board[i][j] = ch;
//                        if(isValidSudoku(board)){
//                            if(solve(board)){
//                                return true;
//                            }else{
//                                board[i][j] = '.';
//                            }
//                        }else{
//                            board[i][j] = '.';
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//    public boolean isValidSudoku(char[][] board) {
//        Set set = new HashSet<String>();
//        for(int i = 0;i < 9;i++){
//            for(int j = 0;j < 9 ;j++){
//                char num = board[i][j];
//                if(num == '.'){
//                    continue;
//                }
//                if(!set.add(num+" in row "+i)||!set.add(num+" in column "+j)||!set.add(num+" in block "+i/3+"-"+j/3) ){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}
