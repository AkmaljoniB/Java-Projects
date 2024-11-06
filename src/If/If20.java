package If;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s, g;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b) {
            s = a - b;
        } else {
            s = b - a;
        }
        if (a > c) {
            g = a - c;
        } else {
            g = c - a;
        }

        if (s > g) {
            System.out.println("Masofa: " + g);
            System.out.println("Нуқтаи наздик: "+ c);
        } else {
            System.out.println("Masofa: " + s);
            System.out.println("Нуқтаи наздик: "+ b);
        }
    }
}
