package Codeforces;

import java.util.Scanner;

public class Lucky_tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k0=0,k1=0,k2=0;
        for (int i = 0; i < n; i++) {
            int a =scanner.nextInt();
            if (a%3==0)k0++;
            else if (a%3==1)k1++;
            else k2++;
        }
        System.out.println(k0/2+Math.min(k1,k2));
    }
}
