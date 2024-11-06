package Alexeev;

import java.util.Scanner;

public class Alexeev_0597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        if (r1 * 2 >= (r2 + r3)*2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}