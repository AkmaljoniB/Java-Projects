package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Vosstanovleniye_tree_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = new int[4];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[3]-arr[2]+" ");
        System.out.print(arr[3]-arr[1]+" ");
        System.out.print(arr[3]-arr[0]);
    }
}
