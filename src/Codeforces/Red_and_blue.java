package Codeforces;

import java.util.Scanner;

public class Red_and_blue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int max1 = 0,max=0;
            for (int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
                int l=0;
                for (int j = 0;j<=i;j++)l+=arr[j];
                max = Math.max(max,l);
            }

            int m = scanner.nextInt();
            int[]ar = new int[m];
            for (int i = 0; i < m; i++) {
                ar[i]=scanner.nextInt();
                int l = 0;
                for (int j = 0;j<=i;j++)l+=ar[j];
                max1 = Math.max(max1,l);
            }
            System.out.println(max+max1);
        }
    }
}