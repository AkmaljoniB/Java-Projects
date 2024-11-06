package Codeforces;

import java.util.Scanner;

public class Game_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (m%n==0){
            int s = m/n;
            int k = 0;
            while (s%2==0){
                s/=2;
                k++;
            }
            while (s%3==0){
                s/=3;
                k++;
            }
            System.out.println(s==1 ?k:-1);
        } else System.out.println(-1);
    }
}
