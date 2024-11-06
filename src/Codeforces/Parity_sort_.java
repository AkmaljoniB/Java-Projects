package Codeforces;

import java.util.Scanner;

public class Parity_sort_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            if (n == 1) System.out.println(0);
            else {
                System.out.println((n-1)+"\n1 "+n);
                int k = (arr[n - 1] + arr[0]) % 2 == 0 ? arr[n - 1] : arr[0];
                for (int i = 1; i < n - 1; i++) {
                    if ((arr[i] + k) % 2 == 0) System.out.println((i + 1) + " " + n);
                    else System.out.println(1 + " " + (i + 1));
                }
            }
        }
    }
}
//Akmaljon