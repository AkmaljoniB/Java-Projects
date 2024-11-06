package Codeforces;

import java.util.Scanner;

public class Anti_Fibonacci_permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (n==3)System.out.println("1 3 2\n2 3 1\n3 2 1");
            else {
                for (int i = 0; i < n; i++) {
                    for (int j = n - i; j >= 1; j--) System.out.print(j + " ");
                    for (int j = n; j > n - i; j--) System.out.print(j + " ");
                    System.out.println();
                }
            }
        }
    }
}