package Codeforces;

import java.util.Scanner;

public class Sbalansirovanniy_massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if ((n / 2) % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int[] arr1 = new int[n / 2];
                int[] arr2 = new int[n / 2];
                for (int j = 1; j <=arr1.length; j++) {
                    arr1[j-1]=j*2;
                    System.out.print(arr1[j-1]+" ");
                }
                for (int j = 0;j<arr1.length/2;j++){
                    arr2[j]=arr1[j]-1;
                    System.out.print(arr2[j]+" ");
                }
                for (int j = arr1.length/2;j<arr1.length;j++){
                    arr2[j]=arr1[j]+1;
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}