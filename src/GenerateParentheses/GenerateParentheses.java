package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
//    public List<String> generateParenthesis(int n) {
//        List<String> result = new ArrayList<>();
//        char[] current=new char[2*n];
//        generateString(current,0,result);
//        return result;
//    }
//    public void generateString(char[] current,int pos,List<String> result){
//        if(pos == current.length){
//            if (isValid(current)) {
//                result.add(new String(current));
//            }
//        }else{
//            current[pos]='(';
//            generateString(current,pos+1,result);
//            current[pos]=')';
//            generateString(current,pos+1,result);
//        }
//    }
//    public boolean isValid(char[] s) {
//        Stack<Character> stack = new Stack<>();
//        for(char ch:s){
//            if(ch == '('){
//                stack.push(')');
//            }else if(stack.empty() || stack.pop()!=ch){
//                return false;
//            }
//        }
//        return stack.empty();
//    }



//    public List<String> generateParenthesis(int n) {
//        List<String> result = new ArrayList<>();
//        addParenthesis(result,"",0,0,n);
//        return result;
//    }
//
//    public void addParenthesis(List<String> result,String cur,int open,int close,int max){
//        if(2 * max == cur.length()){
//            result.add(cur);
//            return;
//        }
//        if(open < max){
//            addParenthesis(result,cur+"(",open+1,close,max);
//        }
//        if(close < open){
//            addParenthesis(result,cur+")",open,close+1,max);
//        }
//    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        if(n == 0){
            result.add("");
        }else{
            for(int i = 0; i < n;i++){
                for(String left:generateParenthesis(i)){
                    for(String right:generateParenthesis(n-i-1)){
                        result.add("("+left+")"+right);
                    }
                }
            }
        }
        return result;
    }
}
