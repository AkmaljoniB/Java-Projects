package Codeforces;

import java.util.Scanner;

public class Concerned_residents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[]arr = new int[n];
        int k=0;
        for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();

        for (int i = 1; i < n-1; i++) {
            if (arr[i-1]==arr[i+1]&&arr[i-1]==1 && arr[i]==0){
                arr[i+1]=0;
                k++;
            }
        }
        System.out.println(k);
    }
}