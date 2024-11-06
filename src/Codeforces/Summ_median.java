package Codeforces;

import java.util.Scanner;

public class Summ_median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n * k];
            for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
            int j =n*k;
            long s=0;
            for (int i = 0; i <k; i++) {
                s+=arr[j-n+(n/2+n%2-1)];
                j=j-n+(n/2+n%2-1);
            }
            System.out.println(s);
        }
    }
}
