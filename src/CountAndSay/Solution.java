package CountAndSay;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        if( n <= 1){
            return result;
        }
        for(int i = 2;i <= n;i++){
            System.out.println(i+":"+result);
            result = count(result);
        }
        return result;
    }
    public String count(String str){
        if(str.length() == 1){
            return "11";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length-1;i++){
            if(ch[i] == ch[i+1]){
                count++;
            }else{
                sb.append(count+""+ch[i]);
                count = 1;
            }
        }
        sb.append(count+""+ch[ch.length-1]);
        return sb.toString();
    }
}
