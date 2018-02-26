package WildcardMatching;

public class Solution {
//    public boolean isMatch(String s, String p) {
//        boolean[][] matchs = new boolean[s.length()+1][p.length()+1];
//        matchs[s.length()][p.length()] = true;
//        for(int i = p.length() - 1;i >= 0;i--){
//            if(p.charAt(i) != '*' ){
//                break;
//            }else{
//                matchs[s.length()][i] = true;
//            }
//        }
//        for(int i = s.length() - 1;i >= 0;i-- ){
//            for(int j = p.length() - 1 ; j >= 0;j--){
//                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
//                    matchs[i][j] = matchs[i+1][j+1];
//                }else if(p.charAt(j)=='*'){
//                    matchs[i][j] = matchs[i+1][j]||matchs[i][j+1];
//                }else{
//                    matchs[i][j] = false;
//                }
//            }
//        }
//        return matchs[0][0];
//    }
    public boolean isMatch(String str, String pattern) {
        int s = 0,p = 0,match = 0,starIdx = -1;
        while(s < str.length()){
            if( p < pattern.length() &&(pattern.charAt(p)=='?'||pattern.charAt(p)==str.charAt(s))){
                s++;
                p++;
            }else if(p < pattern.length() && pattern.charAt(p)=='*') {
                starIdx = p;
                match = s;
                p++;
            }else if(starIdx != -1){
                p = starIdx + 1;
                match++;
                s = match;
            }else
                return false;
        }
        while( p < pattern.length() && pattern.charAt(p) == '*')
            p++;

        return p==pattern.length();
    }
}
