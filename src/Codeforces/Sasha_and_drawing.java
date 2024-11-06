package Codeforces;

import java.util.Scanner;

public class Sasha_and_drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt(),k = sc.nextInt();
            System.out.println(k == n * 4 - 2?n*2:(k + 1) / 2);
        }
    }
}