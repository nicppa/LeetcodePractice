package PowX;

public class Solution {
    public double myPow(double x, int n) {
        if( x == 0 ){
            return 0;
        }
        if( n == 0){
            return 1;
        }
        if( n < 0 ){
            if( n == Integer.MIN_VALUE ){
                n++;
                if( x < 0 ){
                    x = -x;
                }
            }
            n = -n;
            x = 1/x;
        }
        return (n%2==0)?myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}
