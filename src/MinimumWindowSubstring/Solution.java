package MinimumWindowSubstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if(s==null||s.length()<t.length()||s.length()==0){
            return "";
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int left = 0,minLeft = 0,minLen = s.length()+1,count=0;
        for(int right = 0;right < s.length();right++){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),map.get(s.charAt(right))-1);
                if(map.get(s.charAt(right))>=0){
                    count++;
                }
                while(count == t.length()){
                    if(right-left+1 < minLen){
                        minLeft = left;
                        minLen = right-left+1;
                    }
                    if(map.containsKey(s.charAt(left))){
                        map.put(s.charAt(left),map.get(s.charAt(left))+1);
                        if(map.get(s.charAt(left))>0){
                            count--;
                        }
                    }
                    left++;
                }
            }
        }
        if(minLen > s.length()){
            return "";
        }
        return s.substring(minLeft,minLeft+minLen);
    }
}
