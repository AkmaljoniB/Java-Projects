package Codeforces;

import java.util.Scanner;

public class NOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s, d =0;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0){
                d = i ;
                break;
            }
        }
        s = (a * b) / d ;
        System.out.println(s);
    }
}