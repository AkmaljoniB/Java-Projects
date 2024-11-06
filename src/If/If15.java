package If;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && b < c || b>c && c>a) {
            System.out.println(b+c);
        }
        if (b < c && c < a || c>a && a>b) {
            System.out.println(c+a);
        }
        if (c < a && a < b || a>b && b>c) {
            System.out.println(a+b);
        }
    }
}