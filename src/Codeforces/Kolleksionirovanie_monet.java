package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Kolleksionirovanie_monet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();
            int k = scanner.nextInt();
            Arrays.sort(arr);
            int s = arr[2] - arr[1];
            int s1 = arr[2] - arr[0];
            int x = s + s1;
            if ((k - x) % 3 == 0 && k - x >= 0) {
                System.out.println("YES") ;
            } else {
                System.out.println("NO");
            }
        }
    }
}