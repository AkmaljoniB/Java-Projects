package Codeforces;

import java.util.Scanner;

public class League_rule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x != 0 && y != 0 || x == y || (n - 1) % Math.max(x, y) != 0) System.out.println(-1);
            else {
                int k = 1;
                for (int j = 1; j < n; j++) {
                    System.out.print(k + " ");
                    if (j % Math.max(x, y) == 0) {
                        if (k == 1) k += Math.max(x, y) + 1;
                        else k+=Math.max(x,y);
                    }
                }
                System.out.println();
            }
        }
    }
}