package Alexeev;

import java.util.Scanner;

public class Alexeev_0637 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int a =0;
        for (int i =0; i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int k = scanner.nextInt();
        for (int i =0; i<n;i++){
            if (arr[i]>=k){
                a=a+k;
            } else {
                a = a+arr[i];
            }
        }
        System.out.println(a);
    }
}