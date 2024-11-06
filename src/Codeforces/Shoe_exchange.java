package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Shoe_exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, LinkedList<Integer>> map = new TreeMap<>();
            int k = 0, b = 0, l = 0;
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                if (k == 0) {
                    if (a != b) {
                        b = a;
                        l++;
                        if (l == 2 || (l == 1 && i == n)) k = -1;
                    } else l = 0;
                    if (!map.containsKey(a)) map.put(a, new LinkedList<>());
                    map.get(a).add(i);
                }
            }
            if (k == -1) pr.println(-1);
            else {
                for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
                    int length = entry.getValue().size() - 1;
                    pr.print(entry.getValue().get(length) + " ");
                    for (int i = 0; i < length; i++) pr.print(entry.getValue().get(i) + " ");
                }
                pr.println();
            }
        }
        pr.close();
    }
}
//15 15 15 15 15 15 15 15 27 27