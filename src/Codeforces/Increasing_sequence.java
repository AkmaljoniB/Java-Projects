package Codeforces;

import java.util.Scanner;

public class Increasing_sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int k =0;
            for (int i = 1; i <= n; i++) {
                int a =scanner.nextInt();
                if (a!=k+1)k++;
                else k=a+1;
            }
            System.out.println(k);
        }
    }
}
