package Codeforces;

import java.util.Scanner;

public class Design_from_MKnez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 3) System.out.println("NO");
            else {
                System.out.println("YES");
                if (n % 2 == 0) {
                    for (int i = 0; i < n / 2; i++) System.out.print("1 -1 ");
                } else {
                    for (int i = 0; i < n / 2; i++) System.out.print((n / 2 - 1) + " " + (-(n / 2)) + " ");
                    System.out.print(n / 2 - 1);
                }
                System.out.println();
            }
        }
    }
}
