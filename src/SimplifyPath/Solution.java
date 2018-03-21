package SimplifyPath;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack =new Stack<>();
        for(String filePath:str){
            if("..".equals(filePath)){
                if(!stack.empty()){
                    stack.pop();
                }
            }else if(!"".equals(filePath)&&!".".equals(filePath)){
                stack.push(filePath);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s:stack){
            sb.append("/"+s);
        }
        return sb.length()==0?"/":sb.toString();
    }
}
