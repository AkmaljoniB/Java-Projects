package Task;

import java.util.Scanner;

public class Min_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a >= b && b >= c && c >= d || b >= a && a >= c && c >= d || a >= b && b >= d && d >= c || b >= a && a >= d && d >= c) {
            System.out.println(c);
            System.out.println(d);
        } else if (b >= c && c >= d && d >= a || c >= b && b >= d && d >= a || b >= c && c >= a && a >= d || c >= b && b >= a && a >= d) {
            System.out.println(a);
            System.out.println(d);
        } else if (c >= d && d >= a && a >= b || d >= c && c >= a && a >= b || c >= d && d >= b && b >= a || d >= c && c >= b && b >= a) {
            System.out.println(a);
            System.out.println(b);
        } else if (d >= a && a >= b && b >= c || a >= d && d >= b && b >= c || d >= a && a >= c && c >= b || a >= d && d >= c && c >= b) {
            System.out.println(b);
            System.out.println(c);
        } else if (b >= d && d >= a && a >= c || d >= b && b >= a && a >= c || b >= d && d >= c && c >= a || d >= b && b >= c && c >= a) {
            System.out.println(a);
            System.out.println(c);
        } else if (a >= c && c >= b && b >= d || c >= a && a >= b && b >= d || a >= c && c >= d && d >= b || c >= a && a >= d && d >= b) {
            System.out.println(b);
            System.out.println(d);
        }
    }
}
