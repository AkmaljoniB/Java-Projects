package Codeforces;

import java.util.Scanner;

public class Jeff_and_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0, l;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 5) k++;
        }
        l = n - k;
        if (l != 0) {
            for (int i = 0; i < k / 9; i++) System.out.print("555555555");
            if (k/9>0) {
                for (int i = 0; i < l; i++) System.out.print(0);
            } else System.out.println(0);
        } else System.out.println(-1);
    }
}
