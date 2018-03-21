package EditDistance;

public class Solution {

    public int minDistance(String word1,String word2){
        if(word1.length()==0||word2.length()==0){
            return word1.length()==0?word2.length():word1.length();
        }
        int result[][] = new int[word1.length()+1][word2.length()+1];
        for(int i = 0; i <= word1.length();i++){
            result[i][0] = i;
        }
        for(int j = 1 ; j <= word2.length();j++){
            result[0][j] = j;
        }
        for(int i = 1; i <= word1.length();i++){
            for(int j = 1; j <= word2.length();j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    result[i][j] = result[i-1][j-1];
                }else{
                    result[i][j] = 1+Math.min(result[i-1][j-1],Math.min(result[i][j-1],result[i-1][j]));
                }
            }
        }
        return result[word1.length()][word2.length()];
    }
}
