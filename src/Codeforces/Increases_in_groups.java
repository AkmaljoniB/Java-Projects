package Codeforces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Increases_in_groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t-- > 0; ) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = 0;
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int max = 0;
            int l = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (max <= entry.getValue()) {
                    max = entry.getValue();
                    l = entry.getKey();
                }
            }
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] < arr[i] && arr[i] != l) k++;
            }
            System.out.println(k);
        }
    }
}
