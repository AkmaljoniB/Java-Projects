package MinMax;

import java.util.Scanner;

public class Minmax_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        int b;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int p ;
        for (int i = 0; i < n; i++) {
            System.out.print("A = ");
            a = scanner.nextInt();
            System.out.print("B = ");
            b = scanner.nextInt();
            p = 2*(a + b);
            if (p > max) {
                max = p;
            }
            if (p < min) {
                min = p;
            }
        }
        System.out.println("S kalon = " + max);
        System.out.println("S khurd = " + min);
    }
}