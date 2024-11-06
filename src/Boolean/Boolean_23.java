package Boolean;

import java.util.Scanner;

public class Boolean_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        int x = scanner.nextInt();
        a = x / 1000;
        b = (x / 100) % 10;
        c = (x / 10) % 10;
        d = x % 10;
        boolean n = ((a == d) && (b == c)) ? true : false;
        System.out.println(n);
    }
}
