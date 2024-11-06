package Codeforces;

import java.util.Scanner;

public class How_much_s_the_Daytona_worth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = "NO";
            while (n-- > 0) {
                int a = scanner.nextInt();
                if (a == k) {
                    s = "YES";
                }
            }
            System.out.println(s);
        }
    }
}
