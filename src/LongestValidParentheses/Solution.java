package LongestValidParentheses;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0){
            return 0;
        }
        int max = 0;
        int left = -1;
        Stack<Integer> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < s.length(); i++){
            if(ch[i]=='(' ){
                stack.push(i);
            }else{
                if(stack.empty()){
                    left = i;
                }else{
                    stack.pop();
                    if(stack.empty()){
                        max = Math.max(max,i-left);
                    }else{
                        max = Math.max(max,i-stack.peek());
                    }
                }
            }
        }
        return max;

    }


}
