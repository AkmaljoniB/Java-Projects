package Codeforces;

import java.util.Scanner;

public class Heraldion_monetary_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k =0;
        for (int i = 0; i < n; i++) {
            int a =scanner.nextInt();
            if (a==1)k++;
        }
        if (k!=0) System.out.println(-1);
        else System.out.println(1);
    }
}
