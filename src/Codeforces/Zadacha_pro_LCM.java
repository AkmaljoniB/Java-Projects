package Codeforces;

import java.util.Scanner;

public class Zadacha_pro_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t>0){
            int l =scanner.nextInt();
            int r =scanner.nextInt();
            if (l*2<=r) {
                System.out.println(l);
                System.out.println(l*2);
            } else {
                System.out.println(-1);
                System.out.println(-1);
            }
            t--;
        }
    }
}