package Codeforces;

import java.util.Scanner;

public class Osobaya_perestanovka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        for (int i = 0 ; i <t;i++){
            int a =scanner.nextInt();
            for (int j = 2 ; j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.print(1);
            System.out.println();
        }
    }
}