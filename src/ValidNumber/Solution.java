package ValidNumber;

public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        boolean numberAfterE = true;
        boolean hasDot = false;
        boolean hasE = false;
        boolean hasDigit = false;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length ; i++){
            if(ch[i] >= '0'&& ch[i] <= '9'){
                numberAfterE = true;
                hasDigit = true;
            }else if(ch[i] == '.'){
                if(hasDot || hasE){
                    return false;
                }
                hasDot = true;
            }else if(ch[i] == 'e'){
                if(!hasDigit || hasE){
                    return false;
                }
                numberAfterE=false;
                hasE = true;
            }else if(ch[i] == '-' || ch[i] == '+'){
                if( i != 0 && ch[i-1] != 'e'){
                    return false;
                }
            }else{
                return false;
            }
        }
        return hasDigit&&numberAfterE;
    }

}
