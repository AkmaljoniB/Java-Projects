package Codeforces;

import java.util.*;

public class Array_matching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            String s = "YES";
            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) b[i] = scanner.nextInt();
            int[] c = Arrays.copyOf(a, n);
            Arrays.sort(b);
            Arrays.sort(c);
            Map<Integer, LinkedList<Integer>> map = new LinkedHashMap<>();
            for (int i = 0; i < x; i++) {
                if (b[i] > c[n - 1 - i]) {
                    s = "NO";
                    break;
                }
                if (!map.containsKey(c[n-1-i]))map.put(c[n-1-i],new LinkedList<>());
                map.get(c[n - 1 - i]).add(b[i]);
            }
            if (s.equals("YES")) {
                for (int i = x; i < n; i++) {
                    if (b[i]<c[i-x]){
                        s="NO";
                        break;
                    }
                    if (!map.containsKey(c[i-x]))map.put(c[i-x],new LinkedList<>());
                    map.get(c[i-x]).add(b[i]);
                }
            }
            System.out.println(s);
            if (s.equals("YES")) {
                for (int i = 0; i < n; i++) {
                    System.out.print(map.get(a[i]).get(0)+" ");
                    map.get(a[i]).remove(0);
                }
                System.out.println();
            }
        }
    }
}
