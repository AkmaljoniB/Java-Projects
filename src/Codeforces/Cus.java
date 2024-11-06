package Codeforces;

import java.util.Scanner;

public class Cus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 2 != 0) System.out.println(1);
            else if (n!=2)System.out.println(0);
            else System.out.println(2);
        }
    }
}
