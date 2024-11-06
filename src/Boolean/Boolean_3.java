package Boolean;

import java.util.Scanner;

public class Boolean_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        System.out.println("A = ");
        A = scanner.nextInt();
        if(A % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
