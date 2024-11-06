package Codeforces;

import java.util.Scanner;

public class Phoenix_and_puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            double n = scanner.nextInt();
            if (Math.sqrt(n / 2) == (int) Math.sqrt(n / 2) || Math.sqrt(n / 4) == (int) Math.sqrt(n / 4))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}