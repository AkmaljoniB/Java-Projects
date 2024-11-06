package Alexeev;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

class Alexeev_0011 {

    void slove(Scanner scanner, PrintWriter out) {
        int MaxJump = scanner.nextInt();
        int n = scanner.nextInt();
        BigInteger count[] = new BigInteger[1 + n];
        count[0] = BigInteger.ONE;
        count[1] = BigInteger.ONE;
        for (int i = 2; i <= MaxJump; i++) {
            count[i] = count[i - 1].shiftLeft(1);
        }
        for (int i = MaxJump + 1; i <= n; i++) {
            count[i] = count[i - 1].shiftLeft(1).subtract(count[i - 1 - MaxJump]);
        }
        out.println(count[n]);
    }

    void run() {
        try (
                Scanner scanner = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out);
        ) {
            slove(scanner, out);
        }
    }

    public static void main(String[] args) {
        new Alexeev_0011().run();
    }
}