package Codeforces;

import java.util.Scanner;

public class Krasiviy_massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int b = scanner.nextInt();
            long s = scanner.nextLong();
            if (s / k == b) {
                n--;
                while (n > 0) {
                    System.out.println(0);
                    n--;
                }
                System.out.println(s);
            } else if (s / k < b) {
                System.out.println(-1);
            } else {
                System.out.println(k * b + k - 1);
                s-=k*b+k-1;
                for (int j =0;j<n-1;j++){
                    System.out.println(k-1);
                    s-=k-1;
                    if (s<=k-1 && s!=0){
                        System.out.println(s);
                        break;
                    }
                }
            }
        }
    }
}