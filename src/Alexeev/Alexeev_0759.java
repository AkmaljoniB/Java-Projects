package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<arr.length;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        int s =0;
        for (int i = arr.length-1; i>=arr.length-m ;i--){
            if (arr[i] > 0){
                s = s+arr[i];
            }
        }
        System.out.println(s);
    }
}