package Codeforces;

import java.util.Scanner;

public class Predskazanie_panoramista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = 0;
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                c = i;
                break;
            }
        }
        if (arr[c + 1] == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}