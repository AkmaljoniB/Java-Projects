package If;

import java.util.Scanner;

public class If16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a<b && a<c && b<c) {
            System.out.println(a*2);
            System.out.println(b*2);
            System.out.println(c*2);
        } else {
            System.out.println(-a);
            System.out.println(-b);
            System.out.println(-c);
        }
    }
}