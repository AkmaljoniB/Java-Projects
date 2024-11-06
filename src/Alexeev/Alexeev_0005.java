package Alexeev;

import java.util.Scanner;

public class Alexeev_0005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t=0, j=0;
        int[]arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i<n; i++){
            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
                t++;
            }
        }
        System.out.println();
        for (int i = 0; i<n; i++){
            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
                j++;
            }
        }
        System.out.println();
        if (t>j){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}