package Codingbat.Warmup_1;

public class SumDouble {
    public int sumDouble(int a, int b) {
        int c;
        if (a != b) {
            return a + b;
        }
        c = 2 * (a + b);
        return c;
    }
}