package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, Integer> map = new LinkedHashMap<>();
            Integer[] ar = new Integer[n+1];
            Long[] arr = new Long[n + 1];
            arr[0] = 0L;
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                arr[i] = (long) a;
                ar[i] = a;
                map.put(a, 0);
            }
            Arrays.sort(arr);
            for (int i = 1; i <= n; i++) arr[i] += arr[i - 1];
            map.put((int) (arr[n] - arr[n - 1]), n-1);
            for (int i = n - 1; i > 0; i--) {
                int a = (int) (arr[i+1]-arr[i]);
                int b = (int) (arr[i]-arr[i-1]);
                if (arr[i] >= a)
                    map.put(b, map.get(a));
                else map.put(b,i-1);
            }
            for (int i = 1; i <= n; i++) pr.print(map.get(ar[i])+" ");
            pr.println();
        }
        pr.close();
    }
}
