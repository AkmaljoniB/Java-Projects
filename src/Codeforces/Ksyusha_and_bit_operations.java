package Codeforces;

import java.util.Scanner;

public class Ksyusha_and_bit_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) Math.pow(2, sc.nextInt());
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        while (m-- > 0) {
            int p = sc.nextInt();
            int b = sc.nextInt();
            arr[p - 1] = b;
            int l = n/2;
            int[] ar = new int[l];
            for (int i = 0; i < n; i+=2) ar[i/2] =arr[i]|arr[i+1];
            int o=1;
            while (l>1){
                if (o==0) {
                    for (int i = 0; i < l; i += 2) ar[i / 2] = ar[i] | ar[i + 1];
                }else {
                    for (int i = 0; i < l; i += 2) ar[i / 2] = ar[i] ^ ar[i + 1];
                }
                o^=1;
                l/=2;
            }
            System.out.println(ar[0]);
        }
    }
}
