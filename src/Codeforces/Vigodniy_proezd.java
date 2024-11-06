package Codeforces;

import java.util.Scanner;

public class Vigodniy_proezd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = 0, j,l;
        j = (n / m + 1) * b;
        l= n*a;
        if (n >= m) {
            k += (n / m) * b;
            n = n % m;
        }
        k += n * a;
        int min = Math.min(k,Math.min(j,l));
        System.out.println(min);
    }
}