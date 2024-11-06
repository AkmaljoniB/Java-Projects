package Codingbat.Warmup_1;

public class Diff21 {
    public int diff21(int n) {
        if (n<=21) {
            return 21 - n;
        }
        int c;
        c = Math.abs((21-n)+(21-n));
        return c;
    }
}
