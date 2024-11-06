package Codeforces;

import java.util.Scanner;

public class Srednyaya_visota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int[]arr = new int[n];
            for (int i = 0; i < n; i++) {
                int a =scanner.nextInt();
                if (a%2!=0){
                    for (int k =0 ;k<n;k++){
                        if (arr[k]==0){
                            arr[k]=a;
                            break;
                        }
                    }
                } else {
                    for (int k =n-1 ;k>=0;k--){
                        if (arr[k]==0){
                            arr[k]=a;
                            break;
                        }
                    }
                }
            }
            for (int i = 0 ; i < n;i++){
                System.out.println(arr[i]);
            }
        }
    }
}