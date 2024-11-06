package Codingbat.Logic_2;

public class Blackjack {
    public int blackjack(int a, int b) {
        if (a <= 21 && b > 21) {
            return a;
        }
        if (a > 21 && b <= 21) {
            return b;
        }
        if (a <= 21 && b <= 21 && Math.abs(a - 21) < Math.abs(b - 21)) {
            return a;
        }
        if (a <= 21 && b <= 21 && Math.abs(a - 21) > Math.abs(b - 21)) {
            return b;
        }
        return 0;
    }
}
