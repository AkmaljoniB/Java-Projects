package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Ravenstva_konfet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        for (int j =0;j<t;j++){
            int n =scanner.nextInt();
            int[]arr = new int[n];
            for (int i = 0 ;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Arrays.sort(arr);
            long s=0;
            for (int i = 1;i<n;i++){
                s+=arr[i]-arr[0];
            }
            System.out.println(s);
        }
    }
}