package Codeforces;

import java.util.*;

public class Great_hero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int n = scanner.nextInt();
            long c = 0;
            int[] a = new int[n];
            Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (!map.containsKey(a[i])) map.put(a[i], new LinkedList<>());
            }
            for (int i = 0; i < n; i++) {
                int b = scanner.nextInt();
                map.get(a[i]).add(b);
                c += b;
            }
            out:
            for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    int b = entry.getValue().get(i);
                    int q = B % entry.getKey() == 0 ? B / entry.getKey() : B / entry.getKey() + 1;
                    int w = b % A == 0 ? b / A : b / A + 1;
                    int min =Math.min(q,w);
                    b -= A *min;
                    B -= entry.getKey()*min;
                    if (b < 1) {
                        c = c - entry.getValue().get(i);
                        if (B < 1) break out;
                    } else break out;
                }
            }
            System.out.println(c < 1 ? "YES" : "NO");
        }
    }
}
