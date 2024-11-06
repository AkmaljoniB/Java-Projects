package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Sredstvo_ot_bessonitsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        int d = scanner.nextInt();
        Arrays.sort(arr);
        int s = 0;
        if (arr[0] == 1) {
            System.out.println(d);
        } else {
            s += d / arr[0];
            s += d / arr[1];
            s += d / arr[2];
            s += d / arr[3];
            for (int i = 1; i <= d; i++) {
                if (i % arr[0] == 0) {
                    if (i % arr[1] == 0) {
                        s--;
                    }
                    if (i % arr[2] == 0) {
                        s--;
                    }
                    if (i % arr[3] == 0) {
                        s--;
                    }
                } else if (i % arr[1] == 0) {
                    if (i % arr[2] == 0) {
                        s--;
                    }
                    if (i % arr[3] == 0) {
                        s--;
                    }
                } else if (i % arr[2] == 0) {
                    if (i %arr[3] == 0) {
                        s--;
                    }
                }
            }
            if (s >= d) {
                System.out.println(d);
            } else {
                System.out.println(s);
            }
        }
    }
}