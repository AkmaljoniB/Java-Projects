package Codeforces;

import java.util.Scanner;

public class Ahahahahahahahaha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int l = 0, o = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a == 1) l++;
                else if (a == 0) o++;
            }
            if (o >= l) {
                System.out.println(n / 2);
                for (int i = 0; i < n / 2; i++) System.out.print("0 ");
            } else {
                System.out.println(l - l % 2);
                for (int i = 0; i < l - l % 2; i++) System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
