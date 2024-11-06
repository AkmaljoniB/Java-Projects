package Codeforces;

import java.util.Scanner;

public class Sort_with_AND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int[]arr = new int[n];
            int k =-1;
            for (int i = 0; i < n; i++) {
                arr[i]=scanner.nextInt();
                if (arr[i]!=i && k==-1)k=i;
            }
            System.out.println(k);
        }
    }
}
