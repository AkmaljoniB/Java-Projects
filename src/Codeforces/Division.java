package Codeforces;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =0;i<n;i++){
            int k = scanner.nextInt();
            if (k<=1399){
                System.out.println("Division 4");
            } else if (k<=1599){
                System.out.println("Division 3");
            } else if (k<=1899){
                System.out.println("Division 2");
            } else {
                System.out.println("Division 1");
            }
        }
    }
}
