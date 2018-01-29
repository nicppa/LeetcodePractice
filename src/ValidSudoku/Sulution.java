package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

public class Sulution {
//    public boolean isValidSudoku(char[][] board) {
//        for(int i = 0;i < 9;i++){
//            for(int j = 0;j < 9;j++){
//                char ch = board[i][j];
//                if(ch == '.'){
//                     continue;
//                }
//                //row
//                for(int k = j + 1;k < 9;k++){
//                    char temp = board[i][k];
//                    if(temp == '.'){
//                        continue;
//                    }
//                    if(ch == temp){
//                        return false;
//                    }
//                }
//                //column
//                for(int k = i + 1;k < 9;k++){
//                    char temp = board[k][j];
//                    if(temp == '.'){
//                        continue;
//                    }
//                    if(ch == temp){
//                        return false;
//                    }
//                }
//                //nine
//                //(2,2) -->i/3=0;i%3=2;j/3=0;j%3=2;
//                for(int p = i/3*3;p < i/3*3+3;p++){
//                    if(i == p){
//                        continue;
//                    }
//                    for(int q = j/3*3; q < j/3*3+3;q++){
//                        if( j  == q){
//                            continue;
//                        }
//                        char temp = board[p][q];
//                        if(temp == '.'){
//                            continue;
//                        }
//                        if(ch == temp){
//                            return false;
//                        }
//                    }
//                }
//            }
//        }
//        return true;
//    }
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet<String>();
        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9 ;j++){
                 char num = board[i][j];
                 if(num == '.'){
                     continue;
                 }
                 if(!set.add(num+" in row "+i)||!set.add(num+" in column "+j)||!set.add(num+" in block "+i/3+"-"+j/3) ){
                    return false;
                 }
            }
        }
        return true;
    }
}
