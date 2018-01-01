package RegularExpressionMatching;

public class RegularExpressionMatching {

    //recusion
//    public boolean isMatch(String s, String p) {
//        if(p.isEmpty()){
//            return s.isEmpty();
//        }
//
//        boolean firstMatch = (!s.isEmpty())&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
//        if(p.length() >= 2 && p.charAt(1)=='*'){
//            return isMatch(s,p.substring(2))||(firstMatch&&isMatch(s.substring(1),p));
//        }else{
//            return firstMatch&&isMatch(s.substring(1),p.substring(1));
//        }
//    }

    //DP
    public boolean isMatch(String s, String p) {
          if(s == null || p == null){
              return false;
          }
          char[] text = s.toCharArray();
          char[] pattern = p.toCharArray();

          boolean[][] result = new boolean[s.length()+1][p.length()+1];
          result[0][0] = true;

          for(int i = 1;i < result[0].length;i++){
              if(pattern[i-1]=='*'){
                  result[0][i] = result[0][i-2];
              }
          }

          for(int i = 1;i < result.length;i++){
              for(int j = 1;j < result[0].length;j++){
                  if(pattern[j-1] == '.' || pattern[j-1]==text[i-1]){
                      result[i][j]=result[i-1][j-1];
                  }else if(pattern[j-1]=='*'){
                      result[i][j]=result[i][j-2];
                      if(pattern[j-2] == '.' || pattern[j-2]==text[i-1]){
                          result[i][j]= result[i][j] | result[i-1][j];
                      }
                  }else{
                      result[i][j]=false;
                  }
              }
          }
          return result[s.length()][p.length()];
    }

}
