package Codeforces;

import java.util.Scanner;

public class Red_vs_Blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            int p = Math.round((float) r / (b + 1));
            int l = r - (p * (b + 1));
            for (int i = 0; i < b; i++) {
                int k = 0;
                if (l < 0) {
                    k++;
                    l++;
                }
                for (int j = 0; j < p - k; j++) System.out.print("R");
                if (l > 0) {
                    System.out.print("R");
                    l--;
                }
                System.out.print("B");
            }
            for (int i = 0; i < p + l; i++) System.out.print("R");
            System.out.println();
        }
    }
}
