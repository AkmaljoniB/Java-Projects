package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Queries_about_the_number_of_elements_not_exceeding {
    public static void main(String[] args) {
        PrintWriter pr = new PrintWriter(System.out);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer[] arr = new Integer[n];
        Integer[] ar = new Integer[m];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < m; i++) ar[i] = scanner.nextInt();
        Arrays.sort(arr);
        Integer[] a = Arrays.copyOf(ar, m);
        Arrays.sort(a);
        int p = 0, k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = p; j < n; j++) {
                if (a[i] >= arr[j]) {
                    k++;
                    p++;
                } else break;
            }
            map.put(a[i], k);
        }
        for (int i = 0; i < m; i++) pr.println(map.get(ar[i]));
        pr.close();
    }
}
