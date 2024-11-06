package Codeforces;

import java.util.Scanner;

public class Task_about_NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                n = n / 2 - 1;
                System.out.println(n + " " + (n + 1) + " 1");
            } else {
                int a = (n - 1) / 2;
                if (a % 2 == 0) System.out.println((a - 1) + " " + (a +1) + " 1");
                else System.out.println((a-2)+" "+(a+2)+" 1");
            }
        }
    }
}