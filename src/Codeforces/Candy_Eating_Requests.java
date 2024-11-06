package Codeforces;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Candy_Eating_Requests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            Integer[] ar = new Integer[n + 1];
            ar[0] = 0;
            for (int i = 1; i <= n; i++) {
                ar[i] = 0;
                ar[i] += ar[i - 1] + arr[n - i];
            }
            Integer[] a = new Integer[q];
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < q; i++) {
                a[i] = scanner.nextInt();
                map.put(a[i], 0);
            }
            arr = Arrays.copyOf(a, q);
            Arrays.sort(a);
            int j = 1;
            for (int i = 0; i < q; i++) {
                int o = -1;
                for (; j <= n; j++) {
                    if (ar[j] >= a[i]) {
                        o = j;
                        break;
                    }
                }
                map.put(a[i], o);
            }
            for (int i =0;i<q;i++)System.out.println(map.get(arr[i]));
        }
    }
}
