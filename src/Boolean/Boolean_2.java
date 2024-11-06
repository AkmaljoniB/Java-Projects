package Boolean;

import java.util.Scanner;

public class Boolean_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        System.out.println("A = ");
        A = scanner.nextInt();
        if(A % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
