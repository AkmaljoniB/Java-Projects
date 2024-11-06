package Alexeev;

import java.util.Scanner;

public class Alexeev_0026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();
        double r = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (r1+r2>=r&&r+r2>=r1&&r1+r>=r2) System.out.println("YES");
        else System.out.println("NO");
    }
}
