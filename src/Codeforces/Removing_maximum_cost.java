package Codeforces;

import java.util.Scanner;

public class Removing_maximum_cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String s = scanner.next();
            if (b >= 0) System.out.println(n * a + n * b);
            else {
                int k = 1;
                for (int i = 0; i < n - 1; i++){
                    if (!s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) k++;
                }
                System.out.println(a*n+b*(k/2+1));
            }
        }
    }
}