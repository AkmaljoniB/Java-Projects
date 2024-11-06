package Codeforces;

import java.util.Scanner;

public class Omkar_and_water_slide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int[]arr = new int[n];
            arr[0]=scanner.nextInt();
            long max =0;
            for (int i = 1; i <n;i++){
                arr[i]=scanner.nextInt();
                if (arr[i]<arr[i-1]){
                    max = Math.max(max,arr[i-1]-arr[i]);
                    arr[i]=arr[i-1];
                }
            }
            System.out.println(max);
        }
    }
}
