package Boolean;

import java.util.Scanner;

public class Boolean_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a<=0 && b>0 && c>0)
                || (a>0 && b<=0 && c>0)
                || (a>0 && b>0 && c<=0)) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}