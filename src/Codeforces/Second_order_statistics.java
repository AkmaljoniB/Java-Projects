package Codeforces;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Second_order_statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 0;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(scanner.nextInt());
        if (set.size() == 1) System.out.println("NO");
        else for (Integer set1 : set) {
            if (l == 1) {
                System.out.println(set1);
                break;
            }
            l++;
        }
    }
}
