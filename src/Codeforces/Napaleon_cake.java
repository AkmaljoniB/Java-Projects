package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Napaleon_cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            int min=Integer.MAX_VALUE,max=0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a != 0) {
                    int b = Math.max(i-a+1,0);
                    if (b<=max){
                        for (int j = max; j <= i; j++) arr[j] = 1;
                        max = i;
                        if (b<min){
                            for (int j = b; j < Math.min(min,i); j++) arr[j] = 1;
                            min = b;
                        }
                    } else {
                        for (int j = b; j <= i; j++) arr[j] = 1;
                        min = b;
                        max = Math.max(max, i);
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == null) pr.print("0 ");
                else pr.print(arr[i] + " ");
            }
            pr.println();
        }
        pr.close();
    }
}
