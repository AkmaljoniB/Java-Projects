package Codeforces;

import java.util.*;

public class Dima_and_friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, k = 0;
        for (int i = 0; i < n; i++) s += sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            if ((s + i - 1) % (n + 1) != 0) k++;
        }
        System.out.println(k);
    }
}