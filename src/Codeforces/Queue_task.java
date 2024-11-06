package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Queue_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        Integer[]arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
        Arrays.sort(arr);
        int s = 0,k=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=s){
                k++;
                s+=arr[i];
            }
        }
        System.out.println(k);
    }
}
