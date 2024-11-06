package Codeforces;

import java.util.Scanner;

public class Simple_weird_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int k =0;
            while (true){
                int p =-1;
                for (int i = 0; i < n-1; i++) {
                    if (arr[i]>arr[i+1]){
                        p=i%2;
                        break;
                    }
                }
                if (p==-1)break;
                for (int i = k%2; i <n-1 ; i+=2) {
                    if (arr[i]>arr[i+1]){
                        int h = arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=h;
                    }
                }
                k++;
            }
            System.out.println(k);
        }
    }
}