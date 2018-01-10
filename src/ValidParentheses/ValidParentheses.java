package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
//    public boolean isValid(String s) {
//        char ch[] = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0 ; i < s.length(); i++){
//            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
//                stack.push(ch[i]);
//            }else{
//                if(stack.empty()){
//                    return false;
//                }
//                char pop = stack.pop();
//                if((pop=='('&&ch[i]==')') || (pop=='{'&&ch[i]=='}') || (pop=='['&&ch[i]==']')){
//                    continue;
//                }else{
//                    return false;
//                }
//            }
//        }
//        if(stack.empty()){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }else if(ch == '['){
                stack.push(']');
            }else if(ch == '{'){
                stack.push('}');
            }else if(stack.empty() || stack.pop()!=ch){
                return false;
            }
        }
        return stack.empty();
    }
}
