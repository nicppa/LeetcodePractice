package DivideTwoIntegers;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;
        if (dividend == 0 || divisor == Integer.MIN_VALUE) return 0;
        if (dividend > 0 && divisor > 0 && dividend < divisor) return 0;
        if (dividend < 0 && divisor < 0 && dividend > divisor) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
        int power = 1;
        int out = 0;
        divisor = Math.abs(divisor);
        int subtractor = divisor;
        if (dividend == Integer.MIN_VALUE) {
            dividend = Integer.MAX_VALUE - subtractor + 1;
            out += power;
        }
        dividend = Math.abs(dividend);
        while (dividend >= divisor) {
            if (dividend >= subtractor) {
                dividend -= subtractor;
                out += power;
                subtractor = subtractor << 1;
                power = power << 1;
            }
            else {
                subtractor = subtractor >> 1;
                power = power >> 1;
            }
        }
        return sign == 1 ? out : -out;
    }
}
