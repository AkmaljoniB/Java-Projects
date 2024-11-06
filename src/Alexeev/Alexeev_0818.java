package Alexeev;

import java.util.Scanner;

public class Alexeev_0818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr = new int[n];
        int s = 0;
        for (int i =0; i<n;i++){
            arr[i] = scanner.nextInt();
            s += arr[i];
        }
        System.out.println(s-n+1);
    }
}
