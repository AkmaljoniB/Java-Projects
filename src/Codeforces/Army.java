package Codeforces;

import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[]arr = new int[n+2];
        arr[2]=scanner.nextInt();
        for (int i = 3;i<=n;i++){
            arr[i]=arr[i-1]+scanner.nextInt();
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(arr[b]-arr[a]);
    }
}
