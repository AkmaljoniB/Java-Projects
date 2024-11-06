package Codeforces;

import java.util.Scanner;

public class Podarok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == i){
                  arr1[i-1] = j+1;
                }
            }
        }
        for (int i = 0 ; i < n ; i ++){
            System.out.println(arr1[i]);
        }
    }
}