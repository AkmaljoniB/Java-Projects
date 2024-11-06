package Codeforces;

import java.util.Scanner;

public class Donut_shops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a<c) System.out.println(1);
            else System.out.println(-1);
            long q = (long) b *a;
            if (q>c) System.out.println(b);
            else System.out.println(-1);
        }
    }
}
