package Codeforces;

import java.util.Scanner;

public class Sledushiy_round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();
        int[]arr = new int[n];
        int f=0;
        for (int i = 0 ;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for (int  i =0;i<n;i++){
            if (arr[i] >0 && arr[i] >=arr[k-1]){
                f++;
            }
        }
        System.out.println(f);
    }
}