package Codeforces;

import java.util.Scanner;

public class Preparing_for_the_competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int k =scanner.nextInt();
            for (int i =1;i<=k;i++)System.out.print(i+" ");
            for (int i = n; i >k ; i--) System.out.print(i+" ");
            System.out.println();
        }
    }
}
