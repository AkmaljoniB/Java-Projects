package Codeforces;

import java.util.Scanner;

public class Trees_by_the_road {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k = 0,l=0;
        for (int i = 0; i < n; i++) {
            int a= scanner.nextInt();
            k+=Math.abs(a-l)+2;
            l=a;
        }
        System.out.println(k-1);
    }
}
