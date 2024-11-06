package Boolean;

import java.util.Scanner;

public class Boolean_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("A = ");
        a = scanner.nextInt();
        System.out.println("B = ");
        b = scanner.nextInt();
        if (a > 2 && b<=3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}