package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Troyka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            int k = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (map.containsKey(a) && k == 0) {
                    map.put(a, map.get(a) + 1);
                    if (map.get(a) == 3) {
                        System.out.println(a);
                        k++;
                    }
                } else {
                    map.put(a, 1);
                }
            }
            if (k==0){
                System.out.println(-1);
            }
        }
    }
}