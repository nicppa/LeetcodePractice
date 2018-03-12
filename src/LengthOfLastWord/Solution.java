package LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if( s == null || s.length() == 0 ||s.trim().length()==0){
            return 0;
        }

        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
