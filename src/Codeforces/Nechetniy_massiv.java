package Codeforces;

import java.util.Scanner;

public class Nechetniy_massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for (int i = 0 ; i  < n ;i++) {
            long a = scanner.nextLong();
            if(a%2!=0){
                System.out.println("YES");
            } else {
                while (a % 2 == 0) {
                    a = a / 2;
                }
                if (a % 2 != 0 && a != 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}