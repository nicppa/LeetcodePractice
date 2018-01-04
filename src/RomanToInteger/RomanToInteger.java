package RomanToInteger;

import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                i += 1;
                if (i == s.length() - 1) {
                    return result;
                }
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
//   public int romanToInt(String s) {
//    int result = 0;
//        if(s.indexOf("IV")>-1)
//
//    {
//        result -= 2;
//    }
//
//    ;
//        if(s.indexOf("IX")>-1)
//
//    {
//        result -= 2;
//    }
//
//    ;
//        if(s.indexOf("XL")>-1)
//
//    {
//        result -= 20;
//    }
//
//    ;
//        if(s.indexOf("XC")>-1)
//
//    {
//        result -= 20;
//    }
//
//    ;
//        if(s.indexOf("CD")>-1)
//
//    {
//        result -= 200;
//    }
//
//    ;
//        if(s.indexOf("CM")>-1)
//
//    {
//        result -= 200;
//    }
//
//    ;
//
//    char[] Arr = s.toCharArray();
//
//        for(
//    int i = 0;
//    i<Arr.length;i++)
//
//    {
//        if (Arr[i] == 'M') result += 1000;
//        if (Arr[i] == 'D') result += 500;
//        if (Arr[i] == 'C') result += 100;
//        if (Arr[i] == 'L') result += 50;
//        if (Arr[i] == 'X') result += 10;
//        if (Arr[i] == 'V') result += 5;
//        if (Arr[i] == 'I') result += 1;
//    }
//
//
//
//        return result;
//}

}
