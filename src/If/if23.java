package If;

import java.util.Scanner;

public class if23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        if (x1 != x2 && x1 != x3) {
            System.out.println("x4 = " + x1);
        } else if (x2 != x3 && x2 != x1) {
            System.out.println("x4 = " + x2);
        } else if (x3 != x1 && x3!=x2) {
            System.out.println("x4 = " + x3);
        }
        if (y1 != y2 && y1 != y3) {
            System.out.println("y4 = " + y1);
        } else {
            if (y2 != y3 && y2 != y1) {
                System.out.println("y4 = " + y2);
            } else {
                if (y3 != y1) {
                    System.out.println("y4 = " + y3);
                }
            }
        }
    }
}