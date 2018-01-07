package LetterCombinationsOfAPhoneNumber;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();

        if(digits == null || digits.length() == 0){
            return result;
        }

        result.add("");
        String[] map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i = 0; i < digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String t = result.remove();
                for(char ch:map[x].toCharArray()){
                    result.add(t+ch);
                }
            }
        }
        return result;
    }
}
