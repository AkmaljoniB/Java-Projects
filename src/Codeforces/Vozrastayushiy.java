package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Vozrastayushiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int k = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (set.contains(a)) {
                    k++;
                } else {
                    set.add(a);
                }
            }
            if (k == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
