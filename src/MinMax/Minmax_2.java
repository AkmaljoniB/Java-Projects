package MinMax;

import java.util.Scanner;

public class Minmax_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        int b;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int s ;
        for (int i = 0; i < n; i++) {
            System.out.print("A = ");
            a = scanner.nextInt();
            System.out.print("B = ");
            b = scanner.nextInt();
            s = a * b;
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
        }
        System.out.println("S kalon = " + max);
        System.out.println("S khurd = " + min);
    }
}