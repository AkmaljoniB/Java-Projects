package Codeforces;

import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 4) {
                a4++;
            } else if (a == 3) {
                a3++;
            } else if (a == 2) {
                a2++;
            } else if (a == 1) {
                a1++;
            }
        }
        k += a4;
        k += a2 / 2;
        a2 = a2 - (a2 / 2 * 2);
        int min = Math.min(a1, a3);
        k += min;
        a1 -= min;
        a3 -= min;
        if (a1==0){
            System.out.println(k+a2+a3);
        } else if ((a1+a2*2+a3*3) % 4==0){
            System.out.println(k+(a1+a2*2+a3*3)/4);
        } else {
            System.out.println(k+(a1+a2*2+a3*3)/4+1);
        }
    }
}