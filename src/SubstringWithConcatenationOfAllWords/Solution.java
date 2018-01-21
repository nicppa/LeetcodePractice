package SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(s.length() == 0 || words.length ==0 || words[0].length() > s.length() ){
            return result;
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        int wordLength = words[0].length();
        int wordsLength = words.length;
        for(int i = 0; i < s.length()-wordsLength*wordLength+1;i++){
            Map<String,Integer> count = new HashMap<>();
            int j = 0;
            while(j < wordsLength){
                String word = s.substring(i + j*wordLength,i+(j+1)*wordLength);
                if(map.containsKey(word)){
                    count.put(word,count.getOrDefault(word,0)+1);
                    if(count.get(word) > map.getOrDefault(word,0)){
                        break;
                    }

                }else{
                    break;
                }
                j++;
            }
            if(j == wordsLength){
                result.add(i);
            }
        }
        return result;
    }
}
