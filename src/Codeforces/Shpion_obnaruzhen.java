package Codeforces;

import java.util.Scanner;

public class Shpion_obnaruzhen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = 0, d = 0, k = 0, l = 0;
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                if (j == 0) {
                    s = a;
                    d = a;
                }
                if (d != a && k == 0) {
                    d = a;
                    l = j;
                    k++;
                } else if (k == 1) {
                    if (s == a) {
                        System.out.println(l + 1);
                        k++;
                    } else {
                        System.out.println(1);
                        k++;
                    }
                }
            }
            if(k==1){
                System.out.println(n);
            }
        }
    }
}