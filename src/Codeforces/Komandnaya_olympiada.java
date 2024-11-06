package Codeforces;

import java.util.Scanner;

public class Komandnaya_olympiada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 1) {
                a++;
            }
            if (arr[i] == 2) {
                b++;
            }
            if (arr[i] == 3) {
                c++;
            }
        }
        int min = Math.min(a, Math.min(b, c));
        int k = 0;
        System.out.println(min);
        int []ar = new int[3];
        for (int j = 0; j < min+min; j++) {

            for (int i = 0; i < n; i++) {
                if (arr[i] == 1 && k == 0) {
                    ar[0]=i+1;
                    arr[i] = 0;
                    k++;
                } else if (arr[i] == 2 && k == 1) {
                    ar[1]=i+1;
                    arr[i] = 0;
                    k++;
                } else if (arr[i] == 3 && k == 2) {
                    ar[2]=i+1;
                    arr[i] = 0;
                    System.out.print(ar[0]+" ");
                    System.out.print(ar[1]+" ");
                    System.out.println(ar[2]);
                    k = 0;
                }
            }
        }
    }
}