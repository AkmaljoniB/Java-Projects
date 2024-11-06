package Codingbat.Logic_2;

public class NoTeenSum {
    public int noTeenSum(int a, int b, int c) {
        if (a > 12 && a < 15 && b > 12 && b < 15 && c > 12 && c < 15 || a > 16 && a < 20 && b > 16 && b < 20 && c > 16 && c < 20) {
            return 0;
        }
        if (a > 12 && a < 15 && b > 12 && b < 15 || a > 16 && a < 20 && b > 16 && b < 20) {
            return c;
        }
        if (a > 12 && a < 15 && c > 12 && c < 15 || a > 16 && a < 20 && c > 16 && c < 20) {
            return b;
        }
        if (c > 12 && c < 15 && b > 12 && b < 15 || c > 16 && c < 20 && b > 16 && b < 20) {
            return a;
        }
        if (a > 12 && a < 15 || a > 16 && a < 20) {
            return b + c;
        }
        if (b > 12 && b < 15 || b > 16 && b < 20) {
            return a + c;
        }
        if (c > 12 && c < 15 || c > 16 && c < 20) {
            return b + a;
        }
        return a + b + c;
    }
}
