package Codeforces;

import java.util.Scanner;

public class Medusa_and_undertale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            long k = b;
            for (int i = 0; i < n; i++) {
                int x =scanner.nextInt();
                k += Math.min(x, a-1);
            }
            System.out.println(k);
        }
    }
}
