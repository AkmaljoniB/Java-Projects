package Codeforces;

import java.util.*;

public class Moamen_and_k_subsegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            for (int i = 0; i < n; i++) map.put(b[i], i);
            for (int i = 0; i < n - 1; i++) {
                if (map.get(a[i+1])-map.get(a[i])!=1)k--;
            }
            System.out.println(k < 1 ? "NO" : "YES");
        }
    }
}
