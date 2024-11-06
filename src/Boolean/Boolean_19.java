package Boolean;

import java.util.Scanner;

public class Boolean_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a == -b) && (a != c)
                || (a != b) && (a == -c)
                || (b ==-c) && (b!=a));
    }
}