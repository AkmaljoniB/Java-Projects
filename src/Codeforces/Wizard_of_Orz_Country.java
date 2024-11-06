package Codeforces;

import java.util.Scanner;

public class Wizard_of_Orz_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0) {
            int n = scanner.nextInt();
            System.out.print(9);
            if (n == 2) System.out.print(8);
            else if (n > 2) {
                System.out.print(89);
                for (int i = 0; i < (n - 3) / 10; i++) {
                    System.out.print("0123456789");
                }
                System.out.print("0123456789".substring(0, (n - 3) % 10));
            }
            System.out.println();
        }
    }
}
