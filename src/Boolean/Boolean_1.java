package Boolean;

import java.util.Scanner;

public class Boolean_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  A ;
        System.out.println("A = ");
        A = scanner.nextInt();
        if (A<=0) System.out.println("False");
        if (A>0) System.out.println("True");
    }
}
