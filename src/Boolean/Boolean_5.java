package Boolean;

import java.util.Scanner;

public class Boolean_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("A = ");
        a = scanner.nextInt();
        System.out.println("B = ");
        b = scanner.nextInt();
        if (a >= 0 && b< -2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
