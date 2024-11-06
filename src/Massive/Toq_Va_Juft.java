package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Toq_Va_Juft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Razmer Massive ");
        int n = scanner.nextInt();
        int s = 0;
        int d = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s++;
                System.out.print("[" + arr[i] + "] ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                d++;
                System.out.print("[" + arr[i] + "] ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("Juft: " + s);
        System.out.println("Toq: " + d);
        if (s > d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}