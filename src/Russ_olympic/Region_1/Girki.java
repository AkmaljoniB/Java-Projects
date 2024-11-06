package Russ_olympic.Region_1;

import java.util.Scanner;

public class Girki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 % 2 != 0 || (n1 == 0 && n2 % 2 != 0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int w = n1 / 2 + n2;
            int k2 = Math.min(n2, w / 2);
            int k1 = w - k2 * 2;
            System.out.print(k1 + " " + k2);
        }
    }
}
