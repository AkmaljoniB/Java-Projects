package Task;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long t = scanner.nextLong();
        long s = 0, k = 0;
        for (int i = 0; i < n; i++) {
            long d = scanner.nextLong();
            long b = scanner.nextLong();
            long max = Math.max(d - s - 1, 0);
            if (max != 0) {
                k += max;
                s += max;
            }
            s += b;
        }
        k += Math.max(t - s, 0);
        System.out.println(t - k);
    }
}