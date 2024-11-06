package Codeforces;

import java.util.Scanner;

public class Long_jumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n+1];
            int max = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
                max = Math.max(max, arr[i]);
            }
            int s =0;
            for (int i = 1; i <= 1500; i++) {
                s=i;
                if (s>n)break;
                while (s<=n){
                    s=s+arr[s];
                }
                max = Math.max(s-i,max);
            }
            System.out.println(max);
        }
    }
}
