package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Evolution_of_worms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new LinkedList<>();
        int p1 = -1, p2 = -1, p3 = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            list.add(arr[i]);
        }
        out:
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (list.contains(arr[i] + arr[j])) {
                    p1 = list.indexOf(arr[i] + arr[j]) + 1;
                    p2 = i + 1;
                    p3 = j + 1;
                    break out;
                }
            }
            list.add(arr[i]);
        }
        if (p1 == -1) System.out.println(p1);
        else System.out.println(p1 + " " + p2 + " " + p3);

    }
}