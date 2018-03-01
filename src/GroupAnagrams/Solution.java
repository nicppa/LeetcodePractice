package GroupAnagrams;

import java.util.*;

public class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> result = new ArrayList<>();
//        boolean[] used = new boolean[strs.length];
//        for(int k = 0; k < strs.length;k++){
//            for(List<String> res:result){
//                String first = res.get(0);
//                if(first.length() != strs[k].length()){
//                    continue;
//                }else{
//                    char[] t1 = first.toCharArray();
//                    Arrays.sort(t1);
//                    String firstStr = new String(t1);
//
//                    char[] t2 = strs[k].toCharArray();
//                    Arrays.sort(t2);
//                    String test = new String(t2);
//                    if(test.equals(firstStr)){
//                        res.add(strs[k]);
//                        used[k] = true;
//                        break;
//                    }
//                }
//            }
//            if(used[k] == false){
//                result.add(new ArrayList<>(Arrays.asList(strs[k])));
//            }
//
//        }
//        return result;
//    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(map.containsKey(temp)){
                List<String> value = map.get(temp);
                value.add(str);
            }else{
                map.put(temp,new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
