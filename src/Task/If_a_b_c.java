package Task;

import java.util.Scanner;

public class If_a_b_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && b > c || c > b && b > a) {
            System.out.println(b);
        } else if (b > a && a > c || c > a && a > b) {
            System.out.println(a);
        } else {
            if (a > c && c > b || b > c && c > a) {
                System.out.println(c);
            }
        }
    }
}