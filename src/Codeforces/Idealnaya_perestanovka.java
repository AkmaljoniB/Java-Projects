package Codeforces;

import java.util.Scanner;

public class Idealnaya_perestanovka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2!=0){
            System.out.println(-1);
        } else {
            System.out.print(2+" ");
            System.out.print(1+" ");
            for (int i = n; i > 2; i--) {
                System.out.print(i+" ");
            }
        }
    }
}