package MinMax;

import java.util.Scanner;

public class Minmax_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0, l = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int v = scanner.nextInt();
            int p = m / v;
            if (p > max) {
                max = p;
                l = i;
            }
        }
        System.out.println(l);
        System.out.println(max);
    }
}
