package Russ_olympic.Region_1;

import java.util.Scanner;

public class Konstruktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int d = 0;
        int p=0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if (arr[i]>p && arr[i-1]==arr[i] && arr[i]==arr[i+1]){
                d++;
                p = arr[i];
                i = i+2;
            }
        }
        System.out.println(d);
    }
}
