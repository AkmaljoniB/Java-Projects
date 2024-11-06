package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Po_seridine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[]arr = new int[3];
            arr[0]=scanner.nextInt();
            arr[1]=scanner.nextInt();
            arr[2]=scanner.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}