package Boolean;

import java.util.Scanner;

public class Boolean_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b ;
        System.out.println("A = ");
        a = scanner.nextInt();
        System.out.println("B = ");
        b = scanner.nextInt();
        if (a%2!=0 && b%2==0 || a%2==0 && b%2!=0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
