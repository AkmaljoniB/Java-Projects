package Codeforces;

import java.util.Scanner;

public class Eating_candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i != 0) a[i] = a[i - 1] + arr[i];
                else a[i] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                if (i != 0) b[i] = b[i - 1] + arr[n - 1 - i];
                else b[i] = arr[n - 1 - i];
            }
            int i=0,j=0,k=0;
            while (i+j+2<=n){
                if (a[i]!=b[j]){
                    if (a[i]>b[j])j++;
                    else i++;
                }else {
                    k=i+j+2;
                    i++;
                    j++;
                }
            }
            System.out.println(k);
        }
    }
}