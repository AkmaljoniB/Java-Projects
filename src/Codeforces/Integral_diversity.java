package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Integral_diversity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (set.contains(a)){
                    set.add(-a);
                } else set.add(a);
            }
            System.out.println(set.size());
        }
    }
}