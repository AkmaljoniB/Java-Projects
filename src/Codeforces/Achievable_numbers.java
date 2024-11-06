package Codeforces;

import java.util.Scanner;

public class Achievable_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1, k = 1,p=n-1;
        while (true) {
            if (n % 10 != 0) {
                if (n < 10) {
                    if (p<10) k = 9;
                    else k += 9;
                    break;
                }
                k += 10 - n % 10;
                n = n / 10 + 1;
            } else n /= 10;
        }
        System.out.println(k);
    }
}