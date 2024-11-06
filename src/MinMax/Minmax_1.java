package MinMax;

import java.util.Scanner;

public class Minmax_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a > max) max = a;
            if (a < min) min = a;

        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
