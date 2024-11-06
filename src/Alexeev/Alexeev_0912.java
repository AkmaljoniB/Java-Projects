package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0912 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int s=0;
        int p = 0;
        int[] arr1 = new int[n];
        for (int i =0;i<n;i++){
            if (arr[i]==arr[p]){
                s++;
            } else {
                p = i;
                arr1[i-1]=s;
                s=0;
                i=i-1;
            }
        }
        arr1[n-1]=s;
        int max =-1,j=0,h=0;
        for (int i =0; i< n;i++){
            if (max ==arr1[i]){
                h=max;
            }
            if (max<arr1[i]){
                max = arr1[i];
                j=i;
            }
        }
        if (h!=max) {
            System.out.println(arr[j]);
        } else {
            System.out.println(0);
        }
    }
}
