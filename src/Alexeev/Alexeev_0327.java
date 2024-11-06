package Alexeev;

import java.util.Scanner;

public class Alexeev_0327 {
    public static boolean happy(int n){
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        int d = n / 1000 % 10;
        int e = n / 10000 % 10;
        int f = n / 100000 % 10;
        return a+b+c==d+e+f;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h ;
        for (int i = 0; i < n; i++) {
            h = scanner.nextInt();
            if (happy(h-1)||happy(h+1)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}