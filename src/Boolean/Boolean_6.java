package Boolean;

import java.util.Scanner;

public class Boolean_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c ;
        System.out.println("A = ");
        a = scanner.nextInt();
        System.out.println("B = ");
        b = scanner.nextInt();
        System.out.println("C = ");
        c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
