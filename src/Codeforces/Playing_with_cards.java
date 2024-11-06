package Codeforces;

import java.util.Scanner;

public class Playing_with_cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k1 = scanner.nextInt();
            int k2 = scanner.nextInt();
            int max1 = 0, max2 = 0;
            for (int i = 0; i < k1; i++) max1 = Math.max(max1, scanner.nextInt());
            for (int i = 0; i < k2; i++) max2 = Math.max(max2, scanner.nextInt());
            if (max1 > max2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
